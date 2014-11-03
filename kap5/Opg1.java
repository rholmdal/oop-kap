//Kap.5, oppgave
//Lag et program som beregner og skriver ut (i en dialogboks) summen
//  2 + 4 + 6 + 8 + ... + 98

import javax.swing.JOptionPane;

public class Opg1
{
	public static void main ( String[] args )
	{
		int sum = 0;

		for ( int i = 2; i <= 98; i += 2 )
			sum += i;

  		JOptionPane.showMessageDialog( null, sum );
	}
}