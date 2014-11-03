import javax.swing.JOptionPane;

public class Opg15
{
	public static void main(String[] args)
	{
		String tallStreng1, tallStreng2, tallStreng3;
	   	String resultat;
	   	int tall1, tall2, tall3;

	  	//Innskriving av tall
	  	tallStreng1 = JOptionPane.showInputDialog( "Skriv det føtste tallet:" );
		tallStreng2 = JOptionPane.showInputDialog( "Skriv det andre tallet:" );
	  	tallStreng3 = JOptionPane.showInputDialog( "Skriv det tredje tallet:" );

		// konverterer sifferstrenger til heltallsverdier
		tall1 = Integer.parseInt( tallStreng1 );
		tall2 = Integer.parseInt( tallStreng2 );
		tall3 = Integer.parseInt( tallStreng3 );

		//Avgjør hvilket tall som er størst
		//if ( tall1 > tall2 )
		//	if ( tall1 > tall3)
		//		resultat = "Tall1 er størst";
		//	else
		//		resultat = "Tall3 er størst";
		//else
		//	if (tall2 > tall3)
		//		resultat = "Tall2 er størst";
		//	else
		//		resultat = "Tall3 er størst";

		int minst = tall1;
		if ( tall2 < minst )
			minst = tall2;
		if ( tall3 < minst )
			minst = tall3;

		//Skriver ut resultatet
		JOptionPane.showMessageDialog(null, resultat);

	}
}