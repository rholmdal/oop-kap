import javax.swing.JOptionPane;

public class opg5
{
	public static void main ( String args[] )
	{
		double a, r;
		double pi = 3.14;
		String radius;

		radius = JOptionPane.showInputDialog( "Skriv inn radius:" );
		r = Double.parseDouble ( radius );
		a = pi * r * r;
		JOptionPane.showMessageDialog( null, "Arealer er: " + a,
			"Resultat", JOptionPane.PLAIN_MESSAGE );
	}
}