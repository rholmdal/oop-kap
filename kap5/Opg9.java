/*
Kap. 5, oppgave 9
Lag en versjon av programmet i oppgave 4 ovenfor.
Innlesing av nedre og Ývre grense skal foretas om igjen,
inntil det er lest inn en Ývre grense som er minst like stor som nedre grense.
*/
import javax.swing.JOptionPane;

public class Opg9
{
	public static void main(String[] args)
	{
		int innlestTall, stÝrsteTall = 0, nestStÝrsteTall = 0;
		int nedreGrense, ÝvreGrense;

		nedreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn nedre grense:" ) );

		do
		{
			ÝvreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn Ývre grense:" ) );
		} while ( ÝvreGrense < nedreGrense );

		int sum = 0;
		for ( int i = nedreGrense; i < ÝvreGrense; i++ )
			sum += i;
		JOptionPane.showMessageDialog( null, sum );
	}
}