/*
Kap. 6, oppgave 1.
Testprogram for Sirkel-klassen.
Programmet skal fra brukeren lese inn radius til en sirkel og bruke denne
verdien som konstruktørparameter ved opprettelsen av et Sirkel-objekt.
Programmet skal skrive ut radius, diameter, omkrets og areal for sirkelen.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Opg1
{
	public static void main(String[] args)
	{
		boolean enGangTil = true;  // styrevariabel for do-while-løkke
		do
		{
			String formateringsstreng = "0.00";
			DecimalFormat df = new DecimalFormat( formateringsstreng );

			String radius = JOptionPane.showInputDialog(
				  "Skriv inn radiussen til sirkelen (. hvis desimaltall):" );
			double r = Double.parseDouble( radius );
			Sirkel sInfo = new Sirkel(r);
			String utskrift = "Radius: " + radius +
								"\nDiameter: " + df.format(sInfo.diameter()) +
								"\nOmkrets: " + df.format(sInfo.omkrets()) +
								"\nAreal: " + df.format(sInfo.areal());

			JOptionPane.showMessageDialog(
				  null, utskrift, "Bergninger for sirkel med:", JOptionPane.PLAIN_MESSAGE );
			int svar = JOptionPane.showOptionDialog(
				  null, "Vil du beregne flere tider?",
				  "Tidsberegning", JOptionPane.YES_NO_OPTION,
				  JOptionPane.QUESTION_MESSAGE, null, null, null );
			enGangTil = (svar == JOptionPane.YES_OPTION);
		} while ( enGangTil );
	}
}