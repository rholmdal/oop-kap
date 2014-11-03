/*
Kap. 5, oppgave 5
Skriv et program som beregner og skriver ut andre og tredje potens
av de hele tallene fra 0 til 10, sammen med tallene selv.
Presenter ved � bruke tekstomr�de
Lag programmet slik at det er lett � endre hvilket intervall som ska skrives ut.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class Opg5
{
	public static void main (String[] args)
	{
		int minsteTall = 0, st�rsteTall = 10;
		double andrePotens, tredjePotens;

		//Deklarerer desimal formatering
		String formateringsstreng = "0";
		DecimalFormat df = new DecimalFormat( formateringsstreng );

		//oppretter JTextArea for visning av utskrift + overskrift
		JTextArea tekstomr�de = new JTextArea();
		tekstomr�de.setText("Tall \tAndrepotens \tTredjepotens\n" );

		for ( int tall = minsteTall; tall <= st�rsteTall; tall++)
		{
			andrePotens = Math.pow(tall, 2);
			tredjePotens = Math.pow(tall, 3);

			tekstomr�de.append ( tall + "\t" + df.format(andrePotens) +
				"\t" + df.format(tredjePotens) + "\n");
		}

		JOptionPane.showMessageDialog( null, tekstomr�de,
			"Potenstabell", JOptionPane.INFORMATION_MESSAGE );
	}
}