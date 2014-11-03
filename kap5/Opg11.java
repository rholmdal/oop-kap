/*
Kap 5, oppgave 11
Lag et program som kan fortelle brukeren hvor mange dager det er i en m�ned.
Brukeren skal skrive inn navnet p� m�neden. Du trenger ikke ta hensyn til skudd�r.
*/

import javax.swing.JOptionPane;

public class Opg11
{
	public static void main(String[] args)
	{
		String m�ned;
		int antallDager = 0;

		m�ned = JOptionPane.showInputDialog("Skriv inn en m�ned (norsk/sm� bokstaver:");

		switch ( m�ned )
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
				null, antallDager + " dager", m�ned, JOptionPane.INFORMATION_MESSAGE );
		else
			JOptionPane.showMessageDialog(
				null, "Ikke en m�ned", "OBS!", JOptionPane.INFORMATION_MESSAGE );
	}
}