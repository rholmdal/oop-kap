import javax.swing.JFrame;

public class Konverteringstester
{
  public static void main( String[] args )
  {
    Konverteringsvindu vindu = new Konverteringsvindu();
    vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    vindu.setSize( 300, 150 ); //400, 250
    vindu.setVisible( true );
  }
}