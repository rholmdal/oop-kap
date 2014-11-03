/*
Kap. 5, oppgave 8
Utvidet versjon av programmet fra oppgave 7.
I tillegg skal programmet nå beregne gjennomsnittsverdien for de innleste tallene
mellom grensene. Gjennomsnittet skal beregnes i form av et desimaltall.
Programmet skal skrive ut det beregnede gjennomsnittet, formatert til to desimaler,
samt hvor mange av de innleste tallene som var mellom de nevnte grensene.
Divisjon med 0 skal unngås! Dersom ingen av de innleste tallene var mellom grensene,
skal programmet skrive ut en melding om dette istedenfor det som ellers skal skrives ut.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Opg8
{
	public static void main(String[] args)
	{
		//Deklarerer desimal formatering
		String formateringsstreng = "0.00"; //to desimaler
		DecimalFormat df = new DecimalFormat( formateringsstreng );
		double gjennomsnitt;

		int innlestTall, sum = 0, antall = 0;

		innlestTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall:"));
		while ( innlestTall > 0)
		{
			if (innlestTall > 10 && innlestTall < 50)
			{
				antall++;
				sum = sum + innlestTall;
			}
			innlestTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall:"));
		}

		if (sum != 0)
		{
			gjennomsnitt = (double) sum / antall;
			JOptionPane.showMessageDialog( null,
				"Antall inntastede tall mellom 10 og 50 er: " + antall +
				".\nGjennomsnittet av disse tallene er: " + df.format(gjennomsnitt),
				"Resultat", JOptionPane.INFORMATION_MESSAGE );
		}
		else
		{
			JOptionPane.showMessageDialog( null,
				"Ingen inntastede tall er innen for grensene",
				"Resultat", JOptionPane.INFORMATION_MESSAGE );
		}

	}
}