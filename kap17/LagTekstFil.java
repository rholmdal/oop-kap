import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

public class LagTekstFil
{
	private Formatter output; //objekt av klassen Formatter for å lese data til fil


	// åpner fila
	public void aapneFil()
	{
		try
		{
			output = new Formatter ("kunder.txt");//åpner fila kunder.txt for skriving, hvis den ikke finnes, opprettes den
		} // end try
		catch ( SecurityException securityException )
		{
			JOptionPane.showMessageDialog(null, "", "Du har ikke skriverettigheter til denne fila", JOptionPane.PLAIN_MESSAGE );
			System.exit( 1 ); // avslutter programmet
		} // end catch
		catch ( FileNotFoundException fileNotFoundException )
		{
			JOptionPane.showMessageDialog(null, "", "Feil ved åpning av fila", JOptionPane.PLAIN_MESSAGE );
			System.exit( 1 ); // avslutter programmet
		} // end catch
	} // end aapneFil


	// leser poster til fila
	public void leggTilPost()
	{
		// objekter som skal leses til fil
		KontoPost post = new KontoPost();

		int svar =JOptionPane.showOptionDialog(null, "Vil du lese inn flere poster?", "Kontonummer", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null,null);
		while (svar == JOptionPane.YES_OPTION)
		{
			int knt = Integer.parseInt(JOptionPane.showInputDialog("Skriv kontonr "));
			String fNavn = JOptionPane.showInputDialog("Skriv fornavn");
			String eNavn = JOptionPane.showInputDialog("Skriv etternavn");
			Double bal = Double.parseDouble(JOptionPane.showInputDialog("Skriv balanse"));

			try
			{
				post.setKonto(knt);
				post.setForNavn(fNavn);
				post.setEtterNavn(eNavn);
				post.setBalanse(bal);

				if (post.getKonto() > 0 )
				{
				// her leses verdiene til fila
				output.format("%d %s %s %.2f\n", post.getKonto(), post.getForNavn(), post.getEtterNavn(), post.getBalanse());

				} // end if
				else
				{
				JOptionPane.showMessageDialog(null, "", "Kontonr må være >0", JOptionPane.PLAIN_MESSAGE );
				} // end else
			} // end try
			catch ( FormatterClosedException formatterClosedException )
			{
				JOptionPane.showMessageDialog(null, "", "feil ved skriving til fil", JOptionPane.PLAIN_MESSAGE );
				return;
			} // end catch
			catch ( NoSuchElementException elementException )
			{
				JOptionPane.showMessageDialog(null, "", "Feil Input, prøv igjen", JOptionPane.PLAIN_MESSAGE );
			} // end catch
			svar =JOptionPane.showOptionDialog(null, "Vil du lese inn flere poster?", "Kontonummer", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

		} // end while
	} // end leggTilPost


	// lukk file
	public void lukkFil()
	{
		if ( output != null)
		output.close();
	}
}