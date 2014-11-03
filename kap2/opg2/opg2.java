import javax.swing.JOptionPane;

public class opg2
{
	public static void main(String[] args)
	{
		String fNavn;
		String eNavn;
		String utskrift;

		fNavn = JOptionPane.showInputDialog("Skriv inn ditt fornavn");
		eNavn = JOptionPane.showInputDialog("Skriv inn ditt etternavn");
		utskrift = "Hei " + eNavn + ", " + fNavn;
		JOptionPane.showMessageDialog(null, utskrift);
	}
}