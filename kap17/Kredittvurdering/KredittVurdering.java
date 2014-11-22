// Programmet leser en fil sekvensielt og viser innhoodet basert på brukervalg
// (null-balanse, kreditt-balanse, eller debit-balanse).
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.*;


public class KredittVurdering
{
	private MenyValg kontoType; //oppretter objekt av klassen MenyValg (enum)
	private Scanner input; // for å skrive til fil

	private final static MenyValg[] valg = { MenyValg.NULL_BALANSE, MenyValg.KREDITT_BALANSE, MenyValg.DEBIT_BALANSE, MenyValg.SLUTT };


	// leser poster fra fil og viser base poster av lalgt type
	private void lesPoster()
	{
		KontoPost post = new KontoPost();
		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("");

		try // les poster
		{
		// åpne fil og les fra starten
		input = new Scanner(new File("kunder.txt"));

			while(input.hasNext() )// hent verdiene fra fila
			{
				post.setKonto( input.nextInt() );
				post.setForNavn(input.next());
				post.setEtterNavn(input.next() );
				post.setBalanse(input.nextDouble());

				// hvis riktig kontotype, vis poster
				if (skalVises(post.getBalanse()))
					tekstområde.append(post.getKonto() +"\t" + post.getForNavn()+"\t" + post.getEtterNavn()+"\t" + post.getBalanse() +"\n");
			}
			JOptionPane.showMessageDialog(null, tekstområde, null, JOptionPane.PLAIN_MESSAGE);
		} // end try

		catch ( NoSuchElementException elementException )
		{
			JOptionPane.showMessageDialog(null, "Upassende format i fila", null, JOptionPane.PLAIN_MESSAGE);
			input.close();
			System.exit( 1 );
		} // end catch

		catch ( IllegalStateException stateException )
		{
			JOptionPane.showMessageDialog(null, "Feil i lesing fra fil", null, JOptionPane.PLAIN_MESSAGE);
			System.exit( 1 );
		} // end catch

		catch ( FileNotFoundException fileNotFoundException )
		{
			JOptionPane.showMessageDialog(null,  "Feil ved åpning av fila.", null, JOptionPane.PLAIN_MESSAGE );
			System.exit( 1 );
		} // end catch

		{
			if ( input != null )
			input.close();

		}
	} // end lesPoster

	// bestem hvilke poster som skal vises
	private boolean skalVises( double balanse )
	{

		if ( ( kontoType == MenyValg.KREDITT_BALANSE ) && ( balanse < 0 ) )
			return true;
		else if ( ( kontoType == MenyValg.DEBIT_BALANSE ) && ( balanse > 0 ) )
			return true;
		else if ( ( kontoType == MenyValg.NULL_BALANSE )&& ( balanse == 0 ) )
			return true;
		else
			return false;
	} // end skalVises


	// hent brukervalg
	private MenyValg getValgMulighet()
	{
		// vis valgmuligheter

		int valgMulighet = 0;

		try // prøv å få menyvalg fra bruker
		{
			do
			{
				JOptionPane.showMessageDialog(null,"Velg et tall fra menyen\n 1 - skriv poster med null-balanse\n 2 - skriv poster med kreditt-balanse\n 3 - skriv poster med debit-balanse\n 4 - avslutt\n", null, JOptionPane.PLAIN_MESSAGE);
				valgMulighet = Integer.parseInt(JOptionPane.showInputDialog("?: "));

			}
			while  ( (valgMulighet < 1 ) || ( valgMulighet > 4) ) ;
		} // end try

		catch ( NoSuchElementException elementException )
		{
			JOptionPane.showMessageDialog(null, "Upassende input", null, JOptionPane.PLAIN_MESSAGE);
			System.exit( 1 );
		} // end catch

		return valg [ valgMulighet - 1 ]; // return enum value for option
	} // end getValgMulighet



	public void prosessValg()
	{
		// her er selve brukervalget
		kontoType = getValgMulighet();

		while ( kontoType != MenyValg.SLUTT )
		{
			switch ( kontoType )
			{
				case NULL_BALANSE:
				JOptionPane.showMessageDialog( null, null, "Accounts with zero balances:", JOptionPane.PLAIN_MESSAGE );
				break;
				case KREDITT_BALANSE:
				JOptionPane.showMessageDialog(null, null,  "Accounts with credit balances:", JOptionPane.PLAIN_MESSAGE  );
				break;
				case DEBIT_BALANSE:
				JOptionPane.showMessageDialog( null, null, "Accounts with debit balances:" , JOptionPane.PLAIN_MESSAGE );
				break;
			} // end switch

			lesPoster();
			kontoType = getValgMulighet();

		} // end while
	} // end prosessValg
}