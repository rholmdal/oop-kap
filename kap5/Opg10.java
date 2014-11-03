/*
Kap 5, oppgave 10
Lag et program som gjentatte ganger leser inn nummeret til en ukedag,
der 1 svarer til mandag, 2 til tirsdag, og s� videre inntil 7 for s�ndag.
For hvert innlest nummer skal programmet skrive ut navnet p� vedkommende ukedag,
alts� "mandag" i tilfelle det blir lest inn 1 osv.
Dersom det blir lest inn et tall st�rre enn 7, skal teksten "ukjent ukedag" skrives ut.
Dersom det blir lest inn 0 eller en negativ verdi, skal programmet avslutte.
*/

import javax.swing.JOptionPane;

public class Opg10
{
	public static void main(String[] args)
	{
		String dag;
		int innlestTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall:"));
		while ( innlestTall > 0)
		{
			switch ( innlestTall )
			{
				case 1: dag = "mandag"; break;
				case 2: dag = "tirsdag"; break;
				case 3: dag = "onsdag"; break;
				case 4: dag = "torsdag"; break;
				case 5:  dag = "fredag"; break;
				case 6:  dag = "l�rdag"; break;
				case 7:  dag = "s�ndag"; break;
				default: dag = "ukjent ukedag"; break;
			}

			JOptionPane.showMessageDialog(
			null, dag, "Resultat", JOptionPane.INFORMATION_MESSAGE );

			innlestTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et tall:"));
		}

/*		do
		{
			innlestTall = Integer.parseInt(
				JOptionPane.showInputDialog("Skriv et tall:"));
			switch ( innlestTall )
			{
				case 1:  dag = "mandag"; break;
				case 2:  dag = "tirsdag"; break;
				case 3:  dag = "onsdag"; break;
				case 4:  dag = "torsdag"; break;
				case 5:  dag = "fredag"; break;
				case 6:  dag = "l�rdag"; break;
				case 7:  dag = "s�ndag"; break;
				default: dag = "ukjent ukedag"; break;
			}

			JOptionPane.showMessageDialog(
			null, dag, "Resultat", JOptionPane.INFORMATION_MESSAGE );

		} while ( innlestTall > 0);
*/
	}
}