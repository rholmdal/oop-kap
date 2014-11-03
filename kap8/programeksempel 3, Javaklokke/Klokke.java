public class Klokke
{
  private Tid2 tid = new Tid2();

  public void setTime( int h )
  {
    tid.setTid( h, tid.getMinutt(), tid.getSekund() );
  }

  public void setMinutt( int m )
  {
    tid.setTid( tid.getTime(), m, tid.getSekund() );
  }

  public void setSekund( int s )
  {
    tid.setTid( tid.getTime(), tid.getMinutt(), s );
  }

  public void tikk()
  {
    int s = tid.getSekund();
    int m = tid.getMinutt();
    int h = tid.getTime();
    s = (s + 1) % 60;
    if ( s == 0 )
    {
      m = (m + 1) % 60;
      if ( m == 0)
        h = (h + 1) % 24;
    }
    tid.setTid( h, m, s );
  }

  public String visUniversaltid()
  {
    return tid.universaltid();
  }

  public String visStandardtid()
  {
    return tid.standardtid();
  }
}