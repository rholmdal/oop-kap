/*
Metode som leser inn en tekst fra skjermen og sjekker at den innleste verdien
er et tall innenfor et bestemt intervall. Hvis den innleste verdien ikke er et tall,
skal dette komme fram i en feilmelding. Hvis verdien er et tall utenfor intervallet,
skal dette komme fram i en feilmelding. Hvis den innleste verdien er et tall innenfor
intervallet, skal metoden returnere tallet.
*/
import javax.swing.JOptionPane;

public class SkjermInput
{

	public String Heltall(int min, int maks)
	{
		String utskrift = "";
		int tall;

		try
		{
			tall = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn et heltall: " ) );
		}
		catch( NumberFormatException nfe )
		{
		    return "Du skrev ikke inn et heltall!";
		}

  		if ( tall >= min && tall <= maks )
		{
			utskrift = "" + tall;
		}
		else
		{
			utskrift = "Tallet er utenfor grensene.";
		}

		return utskrift;
	}

	/*public String Heltall()
	{
		//JTextArea utskrift = new JTextArea();
		String utskrift = "";
		String melding;
		int tall;

		try
		{
			tall = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn et heltall: " ) );
		}
		catch( NumberFormatException nfe )
		{
			return "Du skrev ikke inn et heltall!";
		}

		return "" + tall;
	}*/


	/*public String Desimaltall(double min, double maks)
	{
		//JTextArea utskrift = new JTextArea();
		String utskrift = "";
		double tall;

		try
		{
			tall = Double.parseDouble( JOptionPane.showInputDialog(
				"Skriv inn et desimaltall: " ) );
		}
		catch( NumberFormatException nfe )
		{
			return "Du skrev ikke inn et desimaltall";
		}

		if ( tall >= min && tall <= maks )
		{
			utskrift = "" + tall;
		}
		else
		{
			utskrift = "Tallet er utenfor grensene.";
		}

		return utskrift;
	}*/

}