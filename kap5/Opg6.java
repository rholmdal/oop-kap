/*
Kap. 6, oppgave 6
Lag et applikasjonsprogram som trekker 100 slumptall (hele tall) i
intervallet fra 0 (inkludert) til 100 (ikke inkludert).
Programmet skal skrive ut i tabellform alle tall som blir trukket,
med 10 tall per linje.
Utskriften skal gjøres i et tekstområde som blir plassert i dialogboks.
Programmet skal også finne og skrive ut det minste, det nest minste,
det nest største og det største av tallene som blir trukket.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Opg6
{
	public static void main(String[] args)
	{
		int startTall = 0;
		int sluttTall = 100;
		int minsteTall, nestMinsteTall;

		JTextArea tekstområde = new JTextArea();
		tekstområde.setText( sluttTall - startTall + " tilfeldige tall mellom " +
			startTall + " og " + sluttTall + ".\n" );

		for (int x = startTall; x < sluttTall; x++)
		{
			int tilfeldigTall = (int) (Math.random() * 100);
			//NB! mangler det minste, det nest minste, det nest største og det største
			if (((x-startTall)%10 != 0))
				tekstområde.append ( tilfeldigTall + ", " );
			else
				tekstområde.append ( "\n" );
		}

		JOptionPane.showMessageDialog( null, tekstområde,
			"Tilfeldig?", JOptionPane.INFORMATION_MESSAGE );
	}
}