import javax.swing.*;
import java.awt.*;

public class Arraytestvindu extends JFrame
{
	private JTextArea utskrift;
  	private Arraybehandler behandler;

	public Arraytestvindu()
	{
		//super("Arrayparametre");
		behandler = new Arraybehandler();
		Container c = getContentPane();
		utskrift = new JTextArea(10, 30);
		utskrift.setEditable(false);
		utskrift.setTabSize(5);
		JScrollPane skrollefelt = new JScrollPane(utskrift);
		c.add(skrollefelt);
		setSize(650, 250);
		setVisible(true);
	}

	public void demonstrerArrayparametre()
	{
		int tallgrense = 20;
		//oppretter slumptallsliste og printer den ut
		int[] liste = behandler.lagListe( 10, tallgrense );
		utskrift.setText("Illustrasjon av arrayparametres virkemåte " +
						 "sammenliknet med parametre av primitiv type\n");
		behandler.print( utskrift, "Opprinnelig array", liste );

		//reverserer lista og printer ut reversert liste
		behandler.reverser( liste );
		utskrift.append(
				"\nReverserer arrayen ved å bruke den som parameter " +
				"i en metode som utfører reverseringen." );
		behandler.print( utskrift, "\nReversert array", liste );

		//printer ut siste listeelement
		utskrift.append(
				"\nSiste arrayelement " + liste[ liste.length - 1 ]  +
				" skal brukes som aktuell parameter en metode som dobler " +
				"mottatt parameterverdi." );

		//viser virkning av dubleringsmetode
		int doblet = behandler.dubler( liste[ liste.length - 1 ] );
		utskrift.append( "\nDoblet verdi av aktuell parameter: " +
				  doblet );
		utskrift.append( "\nAktuell parameter har beholdt sin verdi: " +
			  liste[ liste.length - 1 ] );
	}
}