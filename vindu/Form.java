import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener
{
	//private Rektangel beregn;
	private JTextField tbLengde, tbBredde, tbAreal;
	private JButton knapp;

	public Form()
	{
		super( "Rektangel" );
		//beregn = new Rektangel();

		JLabel ltLengde = new JLabel( "Lengde: " );
		tbLengde = new JTextField( 12 );
		JLabel ltBredde = new JLabel( "Bredde: " );
		tbBredde = new JTextField( 12 );
		JLabel ltAreal = new JLabel( "Arealet er: " );
		tbAreal = new JTextField( 12 );
		tbAreal.setEditable( false );  //gjør tekstfeltet ikke-editerbart

		knapp = new JButton( "Beregn" );
		knapp.addActionListener( this );  //registrerer vinduet som
										  //lytteobjekt for knappen
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add( ltLengde );
		c.add( tbLengde );
		c.add( ltBredde );
		c.add( tbBredde );
		c.add( ltAreal );
		c.add( tbAreal );
		c.add( knapp );
	}

	//Kalles opp hver gang brukeren klikker på knappen trekk.
	public void actionPerformed( ActionEvent e )
	{
		//String måned = lykkehjul.trekkMåned();
		//utskrift.setText( måned );
	}
}