import javax.swing.JOptionPane;

public class Opg1
//Omskriving av oppg 14 i kap 2 med if-else
{
	public static void main(String[] args)
	{
		String tallStreng;
	   	String resultat;
	   	int tall;
	   	int rest;

	  	//Innskriving av tall
	  	tallStreng = JOptionPane.showInputDialog( "Skriv inn ett tall:" );

		// konverterer sifferstrenger til heltallsverdier
		tall = Integer.parseInt( tallStreng );
		rest = tall % 3;

		//Avgjør om inntastet tall er delelig med 3
		if ( rest == 0 )
			resultat = tallStreng + " er delelig med 3";
		else
			resultat = tallStreng + " er ikke delelig med 3";

		//Skriver ut resultatet
		JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
        	JOptionPane.INFORMATION_MESSAGE );

	}
}