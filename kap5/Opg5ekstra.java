/*
Ekstra oppgave til Kap. 5
Skriv et program skriver ut gangetabellen for et inntastet tall mellom 1 og 10.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Opg5ekstra
{
	public static void main (String[] args)
	{

		//oppretter JTextArea for visning av utskrift + overskrift
		JTextArea tekstomr�de = new JTextArea();


		int gangen = Integer.parseInt (	JOptionPane.showInputDialog(
					"Skriv inn et tall:" ));

		tekstomr�de.setText(gangen + "Gangetabellen\n" );

		for ( int i = 1; i <= 10; i++)
			tekstomr�de.append ( i + " * " + gangen + " = " + i * gangen + "\n");

		JOptionPane.showMessageDialog( null, tekstomr�de,
			gangen + "-gangen", JOptionPane.INFORMATION_MESSAGE );
	}
}