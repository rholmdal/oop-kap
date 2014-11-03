import javax.swing.JOptionPane;

public class opg7
{
	public static void main (String args[])
	{
		int sek = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall sekunder"));
		int min = sek / 60;
		JOptionPane.showMessageDialog(null, "er " + min + " minutter");
	}
}