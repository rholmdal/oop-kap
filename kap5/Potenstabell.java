import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Potenstabell
{
	// Beregner og returnerer potensen med grunntall x og eksponenent y
	public int power(int x, int y)
	{
		double potens = Math.pow( x, y);
		return (int) potens;
	}

	public void potenser(int startverdi, int makseksponent, int antall)
	{
		// startverdi: første tall det beregnes potenser for.
		// makseksponenent: høyeste eksponent i potensene som beregnes.
		// antall: antall forskjellige tall det beregnes potenser for.

		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("1. potens\t2. potens\t3. potens\t4.potens\t5. potens\n" );

		for ( int tall = startverdi; tall < startverdi + antall; tall++)
		{
			for (int eksponent = 1; eksponent <= makseksponent; eksponent++)
				{ tekstområde.append (power(tall, eksponent) + "\t"); }

			tekstområde.append ("\n");
		}

		JOptionPane.showMessageDialog( null, tekstområde,
			"Potenstabell", JOptionPane.INFORMATION_MESSAGE );
	}
}