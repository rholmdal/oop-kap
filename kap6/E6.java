/*
Ekstraoppgave fra kapittel 6

Testprogram for metoden.

Lag en metode som leser inn en tekst fra skjermen og sjekker at den innleste verdien
er et tall innenfor et bestemt intervall. Hvis den innleste verdien ikke er et tall,
skal dette komme fram i en feilmelding. Hvis verdien er et tall utenfor intervallet,
skal dette komme fram i en feilmelding. Hvis den innleste verdien er et tall innenfor
intervallet, skal metoden returnere tallet.
*/
import javax.swing.JOptionPane;

public class E6
{
	public static void main( String[] args )
	{
		SkjermInput input = new SkjermInput();

		/* Lager en do - while løkke for å kunne kjøre testprogrammet noen ganger
		for å teste ut resultatet for ulike inntastinger.*/

		int x = 0;
		do
		{
			String utskrift;
			utskrift = input.Heltall(2, 6);
			//utskrift = input.Heltall();
			JOptionPane.showMessageDialog( null, utskrift, "Heltall:",
				JOptionPane.PLAIN_MESSAGE );
			x++;
		} while ( x < 3);


		/*x = 0;
		do
		{
			String utskrift = input.Desimaltall(2.4, 6.5);
			JOptionPane.showMessageDialog( null, utskrift, "Desimaltall:",
				JOptionPane.PLAIN_MESSAGE );
			x++;
		} while ( x < 3);*/

	}
}