/*
Kap 5, oppgave 11
Lag et program som kan fortelle brukeren hvor mange dager det er i en måned.
Brukeren skal skrive inn navnet på måneden. Du trenger ikke ta hensyn til skuddår.
*/

import javax.swing.JOptionPane;

public class Opg11
{
	public static void main(String[] args)
	{
		String måned;
		int antallDager = 0;

		måned = JOptionPane.showInputDialog("Skriv inn en måned (norsk/små bokstaver:");

		switch ( måned )
		{
			case "januar":
			case "mars":
			case "mai":
			case "juli|":
			case "august":
			case "oktober":
			case "desember":  antallDager = 31; break;
			case "februar":
			case "april":
			case "juni":
			case "september":
			case "november":  antallDager = 30; break;
			default: antallDager = 0; break;
		}
		if (antallDager > 0)
			JOptionPane.showMessageDialog(
				null, antallDager + " dager", måned, JOptionPane.INFORMATION_MESSAGE );
		else
			JOptionPane.showMessageDialog(
				null, "Ikke en måned", "OBS!", JOptionPane.INFORMATION_MESSAGE );
	}
}