import javax.swing.JFrame;

public class Klokketest
{
  public static void main( String[] args )
  {
    Klokkevindu vindu = new Klokkevindu();
    vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    vindu.setSize( 350, 120 );
    vindu.setVisible( true );
  }
}