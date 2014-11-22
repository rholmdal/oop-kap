/*
*	Kap. 17, hovedprogram
*/
import javax.swing.JOptionPane;
public class Eo17
{
	public static void main( String[] args )
	{
		KarProtokoll protokoll = new KarProtokoll();
		KlasseListe liste	= new KlasseListe();

		int valg = Integer.parseInt( JOptionPane.showInputDialog(
				"MENY\n
				1 - Lag klaseliste \n
				2 - Lag Klasseprotokoll \n
				3 - Vis protokoll:") );
		while ( valg >= 1 && valg <= 3 )
		{
			if ( valg == 1 ) liste.lagKlasseListeFil();
			else if ( valg == 2 ) protokoll.lagKarProtokollFil();
			else if ( valg == 3 ) protokoll.lesKarProtokollFil();
			valg = Integer.parseInt( JOptionPane.showInputDialog(
				"MENY\n 1 - Lag klaseliste \n 2 - Lag Klasseprotokoll \n 3 - Vis protokoll:") );
		}
		JOptionPane.showMessageDialog(null, "Takk for nå!",
			"Melding", JOptionPane.PLAIN_MESSAGE );
	}
}