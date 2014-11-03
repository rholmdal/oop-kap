import javax.swing.JOptionPane;

//Et program som gjentatte ganger leser inn et antall sekunder
//og skriver ut dette konvertert til timer, minutter og sekunder.
//Programmet skal avsluttes når brukeren skriver et negativt tall.

public class Opg3
{
	public static void main ( String[] args)
	{
		int aTim, aMin, aSek;
		int sek = Integer.parseInt(JOptionPane.showInputDialog
			("Skriv inn antall sekunder. \n Negativt tall for å avslutte!"));

		while ( tidSekunder >= 0 )
		{
			//Skriv om med modulus
			aTim = sek / 3600;
			aMin = (sek - aTim*3600) / 60;
			aSek = (sek - aTim*3600) - aMin*60;

			JOptionPane.showMessageDialog(null, sek + " sekunder, er: " +
				aTim + " timer, " + aMin + " minutter og " + aSek + " sekunder");

			sek = Integer.parseInt(JOptionPane.showInputDialog
				("Skriv inn antall sekunder. \n Negativt for å avslutte!"));
		}
	}
}