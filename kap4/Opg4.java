//Forbedret versjon av programmet fra oppgave 3 med hensyn på utskrift.
//Dersom det innleste antall sekunder er mindre enn 3600,
//skal bare antall minutter og sekunder skrives ut.
//Dersom det innleste antall sekunder er mindre enn 60,
//skal bare innleste antall sekunder skrives ut.
import javax.swing.JOptionPane;

public class Opg4
{
	public static void main ( String [] args )
	{
		int sek = Integer.parseInt(JOptionPane.showInputDialog
			("Skriv inn antall sekunder. \n Negativt tall for å avslutte!"));
		int aTim, aMin, aSek;
		String melding;

		while ( sek >= 0 )
		{
			aTim = sek / 3600;
			aMin = (sek - aTim*3600) / 60;
			aSek = (sek - aTim*3600) - aMin*60;

			if ( aTim > 0 )
				melding = sek + " sekunder, er: " + aTim + " timer, " + aMin + " minutter og " + aSek + " sekunder";
			else if ( aMin > 0 )
				melding = sek + " sekunder, er: " + aMin + " minutter og " + aSek + " sekunder";
			else //( aSek < 60 )
				melding = sek + " sekunder er: " + aSek + " sekunder";

			JOptionPane.showMessageDialog(null, melding);

			sek = Integer.parseInt(JOptionPane.showInputDialog
				("Skriv inn antall sekunder. \n Negativt for å avslutte!"));
		}
	}
}