import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Klokkevindu extends JFrame implements ActionListener
{
  private Klokke ur;
  private JTextField sek, min, time, universaltid, standardtid;
  private JButton klokketikk;

  public Klokkevindu()
  {
    super( "Javaklokke" );
    ur = new Klokke();
    sek = new JTextField( 2 );
    min = new JTextField( 2 );
    time = new JTextField( 2 );
    universaltid = new JTextField( 6 );
    universaltid.setEditable( false );
    standardtid = new JTextField( 6 );
    standardtid.setEditable( false );
    klokketikk = new JButton( "1 sekund fram" );
    sek.addActionListener( this );
    min.addActionListener( this );
    time.addActionListener( this );
    klokketikk.addActionListener( this );
    Container c = getContentPane();
    c.setLayout( new FlowLayout() );
    c.add( new JLabel( "Sett time:" ) );
    c.add( time );
    c.add( new JLabel( "Sett minutt:" ) );
    c.add( min );
    c.add( new JLabel( "Sett sekund:" ) );
    c.add( sek );
    c.add( new JLabel( "Universaltid " ) );
    c.add( universaltid );
    c.add( new JLabel( "Standardtid" ) );
    c.add( standardtid );
    c.add( klokketikk );
    visTid();
  }

  public void visTid()
  {
    universaltid.setText( ur.visUniversaltid() );
    standardtid.setText( ur.visStandardtid() );
  }

  public void actionPerformed( ActionEvent e )
  {
    if ( e.getSource() == time )
    {
      int t = Integer.parseInt( time.getText() );
      ur.setTime( t );
      time.setText( "" );
      visTid();
    }
    else if ( e.getSource() == min )
    {
      int m = Integer.parseInt( min.getText() );
      ur.setMinutt( m );
      min.setText( "" );
      visTid();
    }
    else if ( e.getSource() == sek )
    {
      int s = Integer.parseInt( sek.getText() );
      ur.setSekund( s );
      sek.setText( "" );
      visTid();
    }
    else if ( e.getSource() == klokketikk )
    {
      ur.tikk();
      visTid();
    }
  }
}