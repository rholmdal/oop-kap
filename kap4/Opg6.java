//Ny versjon av oppgave 5 i kap 2.
//Lag et program som leser inn radien til en sirkel,
//beregner og skriver ut sirkelens arela og omkrets.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Opg6
{
	public static void main ( String[] args )
	{
		int rInt;
		double r, a, o;
		double pi = 3.14;
		String radius;

		String formateringsstreng = "0.00";
		DecimalFormat df = new DecimalFormat( formateringsstreng );

		radius = JOptionPane.showInputDialog( "Skriv inn radius:" );
		r = Double.parseDouble ( radius );

		while ( r >= 0.0 )
		{
			a = pi * r * r;
			o = 2 * pi * r;

			String areal = df.format( a );
			String omkrets = df.format( o );
			JOptionPane.showMessageDialog( null,
				"Arealer er: " + areal +
				"\n Omkretsen er: " + omkrets,
				"Resultat", JOptionPane.PLAIN_MESSAGE );

			radius = JOptionPane.showInputDialog( "Skriv inn radius:" );
			r = Double.parseDouble ( radius );
		}
	}
}