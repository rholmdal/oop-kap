/*
Lag et program som simulerer kast med en terning 100 ganger.
Verdiene skal skrives ut i et tekstomr�de med 10 verdier per linje,
med et mellomrom (blankt tegn) mellom hver verdi.
Tekstomr�det skal til slutt vises i en meldingsboks.

Bruk en styrevariabel n i l�kka som foretar simuleringen,
og lar denne g� fra 1 til 100. Hver gang styrevariabelen er delelig med 10,
(n % 10) == 0, tilf�yer du et linjeskifttegn "\n" til tekstomr�det.
*/

import javax.swing.JOptionPane;

public class Opg3
{
	public static void main( String[] args )
	{
		Terning terningen = new Terning();
		int antKast = 100;
		String utskrift = "F�lende er generert:\n";

		for ( int n = 1; n <= antKast; n++ )
		{
			  terningen.kast();
			  int verdi = terningen.getVerdi();
			  if ( (n % 10) == 0 )
			  	utskrift += verdi + "\n";
			  else
			  	utskrift += verdi + ", ";
		}

		JOptionPane.showMessageDialog( null, utskrift, antKast + " terningkast",
			JOptionPane.PLAIN_MESSAGE );
	}
}