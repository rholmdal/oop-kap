import javax.swing.JOptionPane;

public class opg
{
	public static void main(String[] args)
	{
		String fNavn;
		String eNavn;
		String utskrift;

		fnavn = JOptionPane.showInputDialog("Skriv inn ditt fornavn");
		enavn = JOptionPane.showInputDialog("Skriv inn ditt etternavn");
		utskrift = "Hei " + eNavn + ", " + fNavn;
		JOptionPane.showMessageDialog(null, utskrift);
	}
}