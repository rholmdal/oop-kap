//Kap. 5, oppgave 3
//Utvid programmet fra oppgave 2 slik at det også skriver ut det nest
//største av de tallene som ble lest inn.

import javax.swing.JOptionPane;

public class Opg3
{
	public static void main(String[] args)
	{
		int innlestTall, størsteTall = 0, nestStørsteTall = 0;

		for ( int antTall = 1; antTall <= 10; antTall++)
		{
			innlestTall = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn " + antTall + ". tall:" ) );

			if (innlestTall > størsteTall)
			{
				nestStørsteTall = størsteTall;
				størsteTall = innlestTall;
			}
			else if (innlestTall > nestStørsteTall)
				nestStørsteTall = innlestTall;
		}
		JOptionPane.showMessageDialog( null,
			"Største tall er " + størsteTall +
			" og nest størse tall er " + nestStørsteTall );
	}
}