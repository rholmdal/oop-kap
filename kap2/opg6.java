import javax.swing.JOptionPane;

public class opg6
{
	public static void main (String args[])
	{
		String navn = JOptionPane.showInputDialog("Skriv inn navnet ditt.");
		String fÅr = JOptionPane.showInputDialog("Skriv inn ditt fødselsår");
		int født = Integer.parseInt(fÅr);
		int år = 2014;
		int alder = år - født;
		JOptionPane.showMessageDialog(null, "Hei " + navn +
			" i år blir du " + alder + " år.", "Resultat", JOptionPane.PLAIN_MESSAGE);
	}
}