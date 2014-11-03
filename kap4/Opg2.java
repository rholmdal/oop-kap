import javax.swing.JOptionPane;

//Beregning av porto utfra vektenm til brevet
public class Opg2
{
	public static void main(String[] args)
	{
		int vekt = Integer.parseInt( JOptionPane.showInputDialog( "Beregning av porto!\nSkriv inn vekten på brevet:" ) );
		String melding;
		double porto = 0.0;

		if ( vekt <= 20 )
			porto = 9.00;
		else if ( vekt <= 50 )
			porto = 14.00;
		else if ( vekt <= 100 )
			porto = 17.00;
		else if ( vekt <= 350 )
			porto = 27.00;
		else if ( vekt <= 1000 )
			porto = 67.00;
		else if ( vekt <= 2000 )
			porto = 145.00;

		if ( vekt <= 2000 )
			melding = "Porto for ditt brev er kr " + porto;
		else
			melding = "Ditt brev kan ikke sendes da det er for tungt!";

		JOptionPane.showMessageDialog( null, melding, "Å sende ditt brev ",
				JOptionPane.INFORMATION_MESSAGE );
	}
}