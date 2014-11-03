/*
Metode som leser inn en tekst fra skjermen og sjekker at den innleste verdien
er et tall innenfor et bestemt intervall. Hvis den innleste verdien ikke er et tall,
skal dette komme fram i en feilmelding. Hvis verdien er et tall utenfor intervallet,
skal dette komme fram i en feilmelding. Hvis den innleste verdien er et tall innenfor
intervallet, skal metoden returnere tallet.
*/
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SkjermInput
{

	public String Heltall(int min, int maks)
	{
		JTextArea utskrift = new JTextArea();
		utskrift.setText( "" );
		boolean erTall = false;

		try
		{
			int tall = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn et tall: " ) );
		}
		catch( NumberFormatException nfe )
		{
		    return "Du skrev ikke inn et heltall!";
		}

  		if ( tall >= min || tall <= maks )
		{
			utskrift = tall;
		}
		else
		{
			utskrift = "Taller er utwenfor grensene";
		}
		return utskrift;
	}
}