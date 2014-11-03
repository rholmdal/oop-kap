import java.io.File;
import javax.swing.*;

public class Fildemo
{
	public static void main( String[] args )
	{

		String sti = JOptionPane.showInputDialog( "Oppgi filnavn eller sti: " );

		sjekkSti(sti);

	} // end main


	// vis info om fil
	public static void sjekkSti( String sti )
	{
		// lag File-objekt

		File filNavn = new File(sti);

		JTextArea tekstområde = new JTextArea();
		tekstområde.setText(sti);

		if( filNavn.exists())// hvis filNavn eksisterer, skriv ut info
		{
			// vis fil (eller bane) info
			tekstområde.append(" finnes");
			if (filNavn.isFile())
				tekstområde.append(", er en fil");
			else
				tekstområde.append(", er en ikke fil");
			if (filNavn.isDirectory())
				tekstområde.append(", er en filbane");
			else
				tekstområde.append(", er en ikke filbane");

			JOptionPane.showMessageDialog(null, tekstområde, "Info om fil", JOptionPane.PLAIN_MESSAGE);
		}

		else // verken fil eller filbane: feilmelding
			JOptionPane.showMessageDialog(null, "feil", "", JOptionPane.PLAIN_MESSAGE);

	} // end sjekkSti
} // end class FilDemo