/*
Kap. 5, oppgave 4
Lag et program som beregner og skriver ut summen av alle hele tall
mellom to grenser som brukeren skriver inn.
Programmet skal starte med � lese inn nedre og �vre grense for summen.
Dersom innlest �vre grense er mindre enn eller lik nedre grense, skal
programmet skrive ut en melding til brukeren om dette og deretter avslutte.
Ellers skal programmet beregne nevnte sum - nedre grense skal tas med i summen,
men ikke �vre grense - og summen skal skrives ut.
*/

import javax.swing.JOptionPane;

public class Opg4
{
	public static void main(String[] args)
	{

		int nedreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn nedre grense:" ) );
		int �vreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn �vre grense:" ) );

		if (�vreGrense <= nedreGrense)
			JOptionPane.showInputDialog( "OBS! Feil inntasting." );
		else
		{
			int sum = 0;
			for ( int i = nedreGrense; i < �vreGrense; i++ )
				sum += i;

	  		JOptionPane.showMessageDialog( null, sum );
		}
	}
}