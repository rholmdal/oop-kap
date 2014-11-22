//import java.util.NoSuchElementException;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class DataBehandler
{
	//private MenyValg kontoType; //oppretter objekt av klassen MenyValg (enum)
	//private Scanner input; // for å skrive til fil

	//private final static MenyValg[] valg = { MenyValg.NULL_BALANSE, MenyValg.KREDITT_BALANSE, MenyValg.DEBIT_BALANSE, MenyValg.SLUTT };


	// leser poster fra fil og viser base poster av lalgt type

	public void DataBehandler()
	{
	}

	public void lesKlasseliste()
	{
			JTextArea tekstområde = new JTextArea();

		tekstområde.setText("");

		String datafil = "data.txt";
		BufferedReader br = null;
		String line = "";
		String dataSkille = ";";

		try // les en linje med data
		{
			br = new BufferedReader(new FileReader(datafil));
			while ((line = br.readLine()) != null)
			{
				// split line by separator
				String[] t = line.split(dataSkille);
				elevRegistrering.setElevNavn( t[0] );
				elevRegistrering.SetElevFag( t[1] );
				elevRegistrering.setElevKarakter( t[2] );
			}
		} // end try

		catch ( NoSuchElementException elementException )
		{
			JOptionPane.showMessageDialog(null, "Upassende format i fila", null, JOptionPane.PLAIN_MESSAGE);
			br.close();
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
			br.close();
		}
	}
	//////////////
	public void lagProtokoll(String fag)
	{
		File file = new File( fag +".csv");
		if ( !file.exists() )
			file.createNewFile();

		FileWriter fw = new FileWriter(file);
		bw = new BufferedWriter( fw );
		bw.write( elevRegistrering.getElevNavn() + ";" );
		bw.write( elevRegistrering.getElevFag() + ";" );
		bw.write( elevRegistrering.getElevKarakter() );
		bw.newLine();
		bw.close();
        fw.close();
	}

	//////////////

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