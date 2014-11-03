import java.util.Random;

public class Terning
{
	private int verdi;
	private Random generator = new Random();

	// denne brukes ikke i dette programmet, men sikrer at det alltid blir
	// generert en kast-verdi når klassen deklareres
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