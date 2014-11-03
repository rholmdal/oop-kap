//Kap.5, oppgave 2
//Lag et program som leser inn 10 heltallsverdier fra brukeren
//og skriver ut (i en dialogboks) den største verdien som ble lest inn.

import javax.swing.JOptionPane;

public class Opg2
{
	public static void main(String[] args)
	{
		int innlestTall, størsteTall = 0;

		for ( int antTall = 1; antTall <= 10; antTall++)
		{
			innlestTall = Integer.parseInt (
				JOptionPane.showInputDialog(
					"Skriv inn " + antTall + ". tall:" ));

			if (innlestTall > størsteTall)
				størsteTall = innlestTall;
		}
		JOptionPane.showMessageDialog( null, størsteTall );
	}
}