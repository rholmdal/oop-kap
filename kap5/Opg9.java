/*
Kap. 5, oppgave 9
Lag en versjon av programmet i oppgave 4 ovenfor.
Innlesing av nedre og øvre grense skal foretas om igjen,
inntil det er lest inn en øvre grense som er minst like stor som nedre grense.
*/
import javax.swing.JOptionPane;

public class Opg9
{
	public static void main(String[] args)
	{
		int innlestTall, størsteTall = 0, nestStørsteTall = 0;
		int nedreGrense, øvreGrense;

		nedreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn nedre grense:" ) );

		do
		{
			øvreGrense = Integer.parseInt (
				JOptionPane.showInputDialog( "Skriv inn øvre grense:" ) );
		} while ( øvreGrense < nedreGrense );

		int sum = 0;
		for ( int i = nedreGrense; i < øvreGrense; i++ )
			sum += i;
		JOptionPane.showMessageDialog( null, sum );
	}
}