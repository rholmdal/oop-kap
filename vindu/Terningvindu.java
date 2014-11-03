import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Terningvindu extends JFrame implements ActionListener
{
	private JTextArea utskriftsomr�de; //for utskrift av resultater
	private JTextField skrivefelt;     //for input
	private JLabel skrivefelttekst;    //for tekst foran skrivefeltet

	public Terningvindu()
	{
		super( "Terningkast" );
		utskriftsomr�de = new JTextArea( 10, 20 );
		JScrollPane skrollomr�de = new JScrollPane( utskriftsomr�de );
		skrivefelt = new JTextField( 5 );
		skrivefelt.addActionListener( this );  //registrerer vindusobjektet
										 //som lytteobjekt for skrivefeltet
		skrivefelttekst = new JLabel( "Frekvensen av (1 - 6'ere):" );
		Container c = getContentPane(); //vinduets komponentkontainer
		c.setLayout( new FlowLayout() ); //komponentene skal plasseres etter
										 //hverandre rad for rad
		c.add( skrivefelttekst );   //plasserer komponentene i kontaineren
		c.add( skrivefelt );        //i den rekkef�lge vi vil ha dem
		c.add( skrollomr�de );
		utskriftsomr�de.setText( "Resultat av 6000 kast.\n" );
	}

	//metode som blir kalt opp hver gang det trykkes p� retur-tasten
	//mens mark�ren st�r i skrivefeltet
	public void actionPerformed( ActionEvent e )
	{
		Terning terningresultat = new Terning();
		String input = skrivefelt.getText(); //leser inn det som
											 //st�r i tekstfeltet
		int tall = Integer.parseInt( input );

		String utskrift = "";
		if ( tall < 1 || tall > 6 )
			utskrift = "Feil inntastet verdi! " + tall ;
		else
		{
			int antKast = 6000;
			int valg = 0; // har ikke f�tt noen sekser enn�!

			   for ( int i = 1; i <= antKast; i++ )
			   {
				   terningresultat.kast();
				   int verdi = terningresultat.getVerdi();
				   if ( verdi == tall )
				   valg++;  // ny sekser registrert
			}
			utskrift = "Antall " + input + "'ere er " + valg;
		}
		utskriftsomr�de.append( utskrift + "\n" )
	}
}