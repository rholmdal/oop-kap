/*
Kap. 7, oppgave 3
I kapittel 6, eksempel 2 er det et program der det blir simulert kast med
en terning 6000 ganger. Programmet registrerer og skriver ut hvor mange
ganger det blir seks på terningen.
Du får nå som oppgave å omarbeide programmet slik at det registrerer og
skriver ut frekvensene for alle de seks mulige terningverdiene.
Bruk en array til registrering av frekvensene.
*/
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Opg3
{
	public static void main( String[] args )
	{
		Terning terningen = new Terning();
		int antKast = 6000;
		int antSeksere = 0; // har ikke fått noen sekser ennå!

		int[] frekvens = new int[6];

		for ( int i = 1; i <= antKast; i++ )
		{
		  terningen.kast();
		  frekvens[ terningen.getVerdi()-1 ]++;
		}

		JTextArea utskrift = new JTextArea();
		utskrift.setText( "Frekvenstabell\n" );

		//Fyller string utskrift med tallene som ble tastet inn
		for(int i = 0; i < 6; i++)
		{
			utskrift.append( "Antall " + (i+1) + "'ere : " + frekvens[i] + "\n" );
		}

		JOptionPane.showMessageDialog( null, utskrift, "Utskrift",
			JOptionPane.PLAIN_MESSAGE );
	}
}