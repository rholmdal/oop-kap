/*
Lage et program som foretar 10 innlesinger av heltall fra brukeren.
Det er imidlertid bare tall som er i intervallet 1 til 50
(begge grenser inkludert) som skal lagres.
Men også innlesing av tall utenfor dette intervall teller med blant de 10 innlesingene.
Når innlesingene er fullført, skal programmet skrive ut (i en dialogboks)
10 linjer med stjerner. Antall stjerner på hver linje skal være
lik de tallene som ble lest inn fra brukeren.
På linjer som svarer til innlesinger der det ble lest inn tall
utenfor intervallet 1 til 50, skal det ikke skrives noen stjerner
(altså bare en blank linje).
*/
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Opg2
{
	public static void main(String[] args)
	{
		int[] tabell = new int [10];
		int[] snuddTabell = new int [10];

		int antall = 0;  // styrevariabel for do-while-løkke
		int tall;
		do
		{
			tall = Integer.parseInt( JOptionPane.showInputDialog(
				  "Skriv inn tall:" ) );
			if (tall >= 1 && tall <= 50)
				tabell[antall] = tall;
			antall++;
		} while ( antall < 10 );

		JTextArea utskrift = new JTextArea();
		utskrift.setText( "Stjernetabell\n" );

		for(int i = 0; i < 10; i++)
		{
			if (tabell[i] > 0)
			{
				for (int x = 1; x < tabell[i]; x++)
				{
					utskrift.append( "*" );
				}
			}
			else
				utskrift.append( "\n" );
			utskrift.append( "\n" );
		}

		JOptionPane.showMessageDialog( null, utskrift, "Utskrift",
			JOptionPane.PLAIN_MESSAGE );

	}
}