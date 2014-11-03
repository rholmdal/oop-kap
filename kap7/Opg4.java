/*
Kap. 7 oppgave 4

Lag et program som leser inn hele tall og lagrer dem i en array.
Programmet skal imidlertid bare lagre de tall som ikke er lest inn allerede
(arrayen skal alts� ikke inneholde noen duplikater av tall).
Alle tall som leses inn skal v�re i intervallet 20 til 100,begge grenser inkludert.
Programmet skal lese inn i alt 20 forskjellige tall fra dette intervallet.
Programmet skal skrive ut feilmelding hver gang brukeren
pr�ver seg med en verdi utenfor det nevnte intervall,
og programmet skal foreta ny innlesing av dette tallet gjentatte ganger
inntil det leses inn et tall fra det riktige intervallet.
N�r alle tallene er lest inn, skal programmet skrive ut
i et tekstomr�de de forskjellige tallene som er lest inn.
Legg inn mellomrom mellom tallene og skriv ut h�gst 5 tall per linje.
(I programeksempel 2 ovenfor, der det skrives ut 10 tall per linje,
kan du se hvordan du kan f� til utskriften p� denne m�ten.)

Programmet skal bruke klassen Tallduplikater.

*/
import javax.swing.JOptionPane;

public class Opg4
{
	public static void main(String[] args)
	{
		Tallduplikater Test = new Tallduplikater();
		Test.lesInnTall();
		Test.visInnlesteTall();

		/*
		//Med l�kker og klassekall med bruk av parametere
		//for � kunne taste inn minVerdi, maksVerdi og antVerdier i tabellen.
		//Og styre om programmet skal kj�res flere ganger.

		boolean enGangTil = true;  // styrevariabel for do-while-l�kke
		do
		{
			int minVerdi = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn minste lovlige tall:" ) );
			int maksVerdi = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn st�rste lovlige tall:" ) );
			int antVerdier = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn st�rrelsen p� tabellen" ) );

			Tallduplikater Test = new Tallduplikater( minVerdi, maksVerdi, antVerdier );
			Test.lesInnTall();
			Test.visInnlesteTall();

			int svar = JOptionPane.showOptionDialog( null,
				"Vil du beregne flere tider?",
				"Tidsberegning", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, null, null );
			enGangTil = (svar == JOptionPane.YES_OPTION);
		} while ( enGangTil );
		*/
	}
}