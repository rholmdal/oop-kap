/*
Kap. 7, oppgave 1
Lag et program som leser inn 10 heltall fra brukeren
og skriver dem ut igjen i motsatt rekkefølge
med ett tall per linje i en dialogboks.
(Lagre de innleste tallene i en array.)
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Opg1
{
	public static void main(String[] args)
	{
		int[] tabell = new int [10];
		int[] snuddTabell = new int [10];

		int antall = 0;  // styrevariabel for do-while-løkke

		do
		{
			tabell[antall] = Integer.parseInt( JOptionPane.showInputDialog(
				  "Skriv inn et tall" ) );
			snuddTabell[(tabell.length-1) - antall ] = tabell[ antall ];
			antall++;
		} while ( antall < 10 );

		JTextArea utskrift = new JTextArea();
		utskrift.setText( "Snudd tabell\n" );

		//Fyller string utskrift med tallene som ble tastet inn
		for(int i = 0; i < 10; i++){ utskrift.append( tabell[i] + " " );}

		//Ønsker at tallene i omvendt rekkefølge skal komme på linjen nunder
		utskrift.append( "\n" );
		for(int i = 0; i < 10; i++) { utskrift.append(snuddTabell[i] + " "); }

		JOptionPane.showMessageDialog( null, utskrift, "Utskrift",
			JOptionPane.PLAIN_MESSAGE );

	}
}