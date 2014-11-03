import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Konverteringsvindu extends JFrame implements ActionListener
{
  private JTextArea utskriftsomr�de; //for utskrift av resultater
  private JTextField skrivefelt;     //for input
  private JLabel skrivefelttekst;    //for tekst foran skrivefeltet

  public Konverteringsvindu()
  {
    super( "Tidskonvertering" );
    utskriftsomr�de = new JTextArea( 10, 30 );
    JScrollPane skrollomr�de = new JScrollPane( utskriftsomr�de );
    skrivefelt = new JTextField( 10 );
    skrivefelt.addActionListener( this );  //registrerer vindusobjektet
                                     //som lytteobjekt for skrivefeltet
    skrivefelttekst = new JLabel( "Sekunder som skal konverteres:" );
    Container c = getContentPane(); //vinduets komponentkontainer
    c.setLayout( new FlowLayout() ); //komponentene skal plasseres etter
                                     //hverandre rad for rad
    c.add( skrivefelttekst );   //plasserer komponentene i kontaineren
    c.add( skrivefelt );        //i den rekkef�lge vi vil ha dem
    c.add( skrollomr�de );
    utskriftsomr�de.setText( "Konverterte sekunder\n" );
  }

  //metode som blir kalt opp hver gang det trykkes p� retur-tasten 
  //mens mark�ren st�r i skrivefeltet
  public void actionPerformed( ActionEvent e )
  {
    String input = skrivefelt.getText(); //leser inn det som 
                                         //st�r i tekstfeltet
    int sek = Integer.parseInt( input );
    String utskrift = input + " = " + 
            Tidskonverterer.konvertertTid( sek );
    utskriftsomr�de.append( utskrift + "\n" );
  }
}