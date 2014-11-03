import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Konverteringsvindu extends JFrame implements ActionListener
{
  private JTextArea utskriftsområde; //for utskrift av resultater
  private JTextField skrivefelt;     //for input
  private JLabel skrivefelttekst;    //for tekst foran skrivefeltet

  public Konverteringsvindu()
  {
    super( "Tidskonvertering" );
    utskriftsområde = new JTextArea( 10, 30 );
    JScrollPane skrollområde = new JScrollPane( utskriftsområde );
    skrivefelt = new JTextField( 10 );
    skrivefelt.addActionListener( this );  //registrerer vindusobjektet
                                     //som lytteobjekt for skrivefeltet
    skrivefelttekst = new JLabel( "Sekunder som skal konverteres:" );
    Container c = getContentPane(); //vinduets komponentkontainer
    c.setLayout( new FlowLayout() ); //komponentene skal plasseres etter
                                     //hverandre rad for rad
    c.add( skrivefelttekst );   //plasserer komponentene i kontaineren
    c.add( skrivefelt );        //i den rekkefølge vi vil ha dem
    c.add( skrollområde );
    utskriftsområde.setText( "Konverterte sekunder\n" );
  }

  //metode som blir kalt opp hver gang det trykkes på retur-tasten 
  //mens markøren står i skrivefeltet
  public void actionPerformed( ActionEvent e )
  {
    String input = skrivefelt.getText(); //leser inn det som 
                                         //står i tekstfeltet
    int sek = Integer.parseInt( input );
    String utskrift = input + " = " + 
            Tidskonverterer.konvertertTid( sek );
    utskriftsområde.append( utskrift + "\n" );
  }
}