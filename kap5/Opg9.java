/*
Kap. 5, oppgave 9
Lag en versjon av programmet i oppgave 4 ovenfor.
Innlesing av nedre og �vre grense skal foretas om igjen,
inntil det er lest inn en �vre grense som er minst like stor som nedre grense.
*/
import javax.swing.JOptionPane;

public class Opg9
{
	public static void main(String[] args)
	{
		int innlestTall, st�rsteTall = 0, nestSt�rsteTall = 0;
		int nedreGrense, �vreGrense;

		nedreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn nedre grense:" ) );

		do
		{
			�vreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn �vre grense:" ) );
		} while ( �vreGrense < nedreGrense );

		int sum = 0;
		for ( int i = nedreGrense; i < �vreGrense; i++ )
			sum += i;
		JOptionPane.showMessageDialog( null, sum );
	}
}