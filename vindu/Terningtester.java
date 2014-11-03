import javax.swing.JFrame;

public class Terningtester
{
	public static void main( String[] args )
	{
		Terningvindu vindu = new Terningvindu();
		vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		vindu.setSize( 250, 250 );
		vindu.setVisible( true );
	}
}