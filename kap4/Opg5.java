//En ny versjon av oppgave 2 ovenfor.
//Innlesing av brevets vekt og utskrift av porto utføres
//gjentatte ganger inntil det leses inn en negativ verdi for vekten.

import javax.swing.JOptionPane;

public class Opg5
{
	public static void main ( String [] args )
	{
		int vekt = Integer.parseInt( JOptionPane.showInputDialog( "Beregning av porto!\nSkriv inn vekten på brevet:" ) );
		String melding;
		double porto = 0.0;

		while ( vekt >= 0 )
		{
			if ( vekt <= 20 )
				porto = 9.00;
			else if ( vekt <= 50 )
				porto = 14.00;
			else if ( vekt <= 100 )
				porto = 17.00;
			else if ( vekt <= 350 )
				porto = 27.00;
			else if ( vekt <= 1000 )
				porto = 67.00;
			else if ( vekt <= 2000 )
				porto = 145.00;

			if ( vekt <= 2000 )
				melding = "Porto for ditt brev er kr " + porto;
			else
				melding = "Ditt brev kan ikke sendes da det er for tungt!";

			JOptionPane.showMessageDialog( null, melding, "Å sende ditt brev ",
					JOptionPane.INFORMATION_MESSAGE );

			vekt = Integer.parseInt( JOptionPane.showInputDialog( "Beregning av porto!\nSkriv inn vekten på brevet:" ) );
		}
	}
}