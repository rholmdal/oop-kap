import java.util.Random;

public class Terning
{
  private int verdi;
  private Random generator = new Random();

  public Terning()
  {
    kast();
  }

  public void kast()
  {
    verdi = 1 + generator.nextInt( 6 );
  }

  public int getVerdi()
  {
    return verdi;
  }
}