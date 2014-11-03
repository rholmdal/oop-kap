import javax.swing.JOptionPane;

public class Hilsen
{
	public static void main(String[] args)
	{
		//String navn;
		//navn = JOptionPane.showInputDialog("Hva heter du?");
		//String utskrift;
		//utskrift = "Hei på deg " + navn;
		//JOptionPane.showMessageDialog("", utskrift);
		String fNavn;
		String eNavn;
		String utskrift;

		fnavn = JOptionPane.showInputDialog("Skriv inn ditt fornavn");
		enavn = JOptionPane.showInputDialog("Skriv inn ditt etternavn");
		utskrift = "Hei " + eNavn + ", " + fNavn;
		JOptionPane.showMessageDialog(null, utskrift);
	}
}
