import java.text.DecimalFormat;

public class Tid
{
  private int time, minutt, sekund;

  public Tid()
  {
    this( 0, 0, 0 );
  }

  public Tid( int t )
  {
    this( t, 0, 0 );
  }

  public Tid( int t, int m )
  {
    this( t, m, 0 );
  }

  public Tid( int t, int m, int s )
  {
    setTid( t, m, s );
  }

  public Tid( Tid t )
  {
    this( t.time, t.minutt, t.sekund );
  }

  public void setTid( int t, int m, int s )
  {
    time = ( t >= 0 && t < 24 ) ? t : 0;
    minutt = ( m >= 0 && m < 60 ) ? m : 0;
    sekund = ( s >= 0 && s < 60 ) ? s : 0;
  }

  public String universaltid()
  {
    DecimalFormat toSifre = new DecimalFormat( "00" );
    return toSifre.format( time ) + ":" +
            toSifre.format( minutt ) + ":" + toSifre.format( sekund );
  }

  public String standardtid()
  {
    return time + "." + minutt;
  }
}
