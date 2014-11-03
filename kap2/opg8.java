import javax.swing.JOptionPane;
public class opg8
{
	public static void main(String args[])
	{

		int sek = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall sekunder"));
		int aTim, aMin, aSek;
		aSek = sek;
		aTim = aSek / 3600; //antall timer
		aSek = (aSek - aTim * 3600);
		aMin = aSek / 60; //antall minutter
		aSek = (aSek - aMin * 60);

		aTim = aSek % 60

		JOptionPane.showMessageDialog(null, sek + " sekunder, er: " +
			aTim + " timer, " + aMin + " minutter og " + aSek + " sekunder");
	}
}