/*
Kap. 5, oppgave 7
Lag et program som leser inn hele tall fra brukeren
inntil det blir lest inn et negativt tall.
Programmet skal telle opp hvor mange av de innleste tallene
som er mellom 10 og 50 (ingen av grensene inkludert) og skrive ut dette antallet.
*/

import javax.swing.JOptionPane;

public class Opg7
{
	public static void main(String[] args)
	{
		int antall = 0, min = 10, maks = 50;
		int innlestTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall:"));

		while ( innlestTall > 0)
		{
			if ( innlestTall > min && innlestTall < maks )
				antall++;

			innlestTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall:"));
		}

		JOptionPane.showMessageDialog( null,
			"Antall inntastede tall mellom " + min + " og " + maks + " er: " + antall,
			"Resultat", JOptionPane.INFORMATION_MESSAGE );

	}
}