/*
Kap 5, oppgave 12
Lag et program som kan fortelle brukeren om et år er skuddår eller ikke.
Brukeren skal skrive inn årstallet.
*/

//Et år er skuddår dersom årstallet er delelig med 4, men ikke delelig med 100,
//eller dersom årstallet er delelig med 400. For eksempel er 1992 og 2000 skuddår,
//men 1900 er ikke skuddår.

import javax.swing.JOptionPane;

public class Opg12
{
	public static void main(String[] args)
	{
		String melding = "ikke et skuddår.";

		int år = Integer.parseInt(JOptionPane.showInputDialog("Skriv et årstall:"));

		if (((år % 4 == 0) & (år % 100 != 0))| (år % 400 == 0))
			melding = "et skuddår.";

		JOptionPane.showMessageDialog(null,
			år + " er " + melding, "Resultat", JOptionPane.INFORMATION_MESSAGE );
	}
}