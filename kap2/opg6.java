import javax.swing.JOptionPane;

public class opg6
{
	public static void main (String args[])
	{
		String navn = JOptionPane.showInputDialog("Skriv inn navnet ditt.");
		String f�r = JOptionPane.showInputDialog("Skriv inn ditt f�dsels�r");
		int f�dt = Integer.parseInt(f�r);
		int �r = 2014;
		int alder = �r - f�dt;
		JOptionPane.showMessageDialog(null, "Hei " + navn +
			" i �r blir du " + alder + " �r.", "Resultat", JOptionPane.PLAIN_MESSAGE);
	}
}