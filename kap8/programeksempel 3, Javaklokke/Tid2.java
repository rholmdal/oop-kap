import java.text.DecimalFormat;

public class Tid2
{
  private int time, minutt, sekund;

  public Tid2()
  {
    this( 0, 0, 0 );
  }

  public Tid2( int t )
  {
    this( t, 0, 0 );
  }

  public Tid2( int t, int m )
  {
    this( t, m, 0 );
  }

  public Tid2( int t, int m, int s )
  {
    setTid( t, m, s );
  }

  public Tid2( Tid2 t )
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
    String tid = time + ".";
    if ( minutt < 10 )
      tid += "0";
    return tid + minutt;
  }

  public int getSekund()
  {
    return sekund;
  }

  public int getMinutt()
  {
    return minutt;
  }

  public int getTime()
  {
    return time;
  }
}