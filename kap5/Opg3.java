//Kap. 5, oppgave 3
//Utvid programmet fra oppgave 2 slik at det ogs� skriver ut det nest
//st�rste av de tallene som ble lest inn.

import javax.swing.JOptionPane;

public class Opg3
{
	public static void main(String[] args)
	{
		int innlestTall, st�rsteTall = 0, nestSt�rsteTall = 0;

		for ( int antTall = 1; antTall <= 10; antTall++)
		{
			innlestTall = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn " + antTall + ". tall:" ) );

			if (innlestTall > st�rsteTall)
			{
				nestSt�rsteTall = st�rsteTall;
				st�rsteTall = innlestTall;
			}
			else if (innlestTall > nestSt�rsteTall)
				nestSt�rsteTall = innlestTall;
		}
		JOptionPane.showMessageDialog( null,
			"St�rste tall er " + st�rsteTall +
			" og nest st�rse tall er " + nestSt�rsteTall );
	}
}