import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tallduplikater
{
	/* Deklarasjoner */
	private int maksAntall;
	private int[] tabell;
	private int maksTall, minTall;

	public Tallduplikater()		//public Tallduplikater( int min, int maks, int ant )
	{
		/* Initialisering av variable */
		maksAntall = 20; 	//ant; //
		maksTall = 100;  	//maks; //
		minTall = 20;		//min; //
		tabell = new int [maksAntall];
	}

	public boolean finnes( int tall )
	{
		/* Returnere true eller false avhengig av om tall finnes i array */

		boolean finnesFraFør = false;
		for(int i = 0; i < tabell.length; i++)
		{
			if ( tall == tabell[i])
			{
				finnesFraFør = true;
				break;
			}
		}
		return finnesFraFør;
	}

	public void visInnlesteTall()
	{
		/* Skriver innhold av arrayen med innleste tall ut i tekstområde,
		 høgst 5 tall per linje. Viser tekstområdet i en meldingsboks. */

		 JTextArea utskrift = new JTextArea();
		 utskrift.setText( "Utskrift\n" );

		for ( int i = 0; i < tabell.length; i++ )
		{
			if ( i % 5 == 0 ) //går til begynnelsen av neste linje
			{
				utskrift.append( "\n" );
		 	}
			utskrift.append( tabell[ i ] + "\t" );
		}

		JOptionPane.showMessageDialog( null, utskrift, "Frekvenser",
			JOptionPane.PLAIN_MESSAGE );

	}

	public void lesInnTall()
	{
		/* Leser inn 20 tall fra riktig intervall. Foretar eventuell ny innlesing
		for tall som ikke er i riktig intervall. For hvert innlest tall
		(fra riktig intervall) sjekkes det om samme tall er lest inn
		tidligere. Dersom det ikke er tilfelle, lagres tallet i arrayen
		for dette. */

		int indeks = 0;  // styrevariabel for do-while-løkke
		int tall;
		do
		{
			tall = Integer.parseInt( JOptionPane.showInputDialog(
				"Skriv inn " + (indeks + 1) + ". tall:" ) );
			if ( tall >= minTall && tall <= maksTall && !finnes(tall) )
			{
				tabell[indeks] = tall;
				indeks++;
			}
			else
			{
				JOptionPane.showMessageDialog( null,
					"Tallet finnes fra før eller er utenfor intervallet. Tast inn et nytt tall!",
					"Melding", JOptionPane.INFORMATION_MESSAGE );
			}

		} while ( indeks < maksAntall );
	}
}