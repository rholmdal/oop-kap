import java.util.Random;

public class Trekningsautomat
{
	private String[] m�nedsnavn = { "Januar", "Februar", "Mars", "April", "Mai",
						  "Juni", "Juli", "August", "September",
						  "Oktober", "November", "Desember" };
	private Random generator = new Random();

	public String trekkM�ned()
	{
		int indeks = generator.nextInt( m�nedsnavn.length );
		return m�nedsnavn[ indeks ];
	}
}