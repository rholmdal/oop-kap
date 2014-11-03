public class Tidsberegner
{
  public int antSekunder( int timer, int min, int sek )
  {
    return timer * 3600 + min * 60 + sek;
  }
}