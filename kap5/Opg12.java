/*
Kap 5, oppgave 12
Lag et program som kan fortelle brukeren om et �r er skudd�r eller ikke.
Brukeren skal skrive inn �rstallet.
*/

//Et �r er skudd�r dersom �rstallet er delelig med 4, men ikke delelig med 100,
//eller dersom �rstallet er delelig med 400. For eksempel er 1992 og 2000 skudd�r,
//men 1900 er ikke skudd�r.

import javax.swing.JOptionPane;

public class Opg12
{
	public static void main(String[] args)
	{
		String melding = "ikke et skudd�r.";

		int �r = Integer.parseInt(JOptionPane.showInputDialog("Skriv et �rstall:"));

		if (((�r % 4 == 0) & (�r % 100 != 0))| (�r % 400 == 0))
			melding = "et skudd�r.";

		JOptionPane.showMessageDialog(null,
			�r + " er " + melding, "Resultat", JOptionPane.INFORMATION_MESSAGE );
	}
}