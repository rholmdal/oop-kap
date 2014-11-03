import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Maanedstrekningsvindu extends JFrame implements ActionListener
{
	private Trekningsautomat lykkehjul;
	private JTextField utskrift;
	private JButton trekk;

	public Maanedstrekningsvindu()
	{
		super( "M�nedstrekning" );
		lykkehjul = new Trekningsautomat();
		JLabel ledetekst = new JLabel( "Trukket m�ned: " );
		utskrift = new JTextField( 12 );
		utskrift.setEditable( false );  //gj�r tekstfeltet ikke-editerbart
		trekk = new JButton( "Trekk m�ned" );
		trekk.addActionListener( this );  //registrerer vinduet som
										  //lytteobjekt for knappen
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add( trekk );
		c.add( ledetekst );
		c.add( utskrift );
	}

	//Kalles opp hver gang brukeren klikker p� knappen trekk.
	public void actionPerformed( ActionEvent e )
	{
		String m�ned = lykkehjul.trekkM�ned();
		utskrift.setText( m�ned );
	}
}