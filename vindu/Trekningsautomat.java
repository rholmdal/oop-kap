import java.util.Random;

public class Trekningsautomat
{
	private String[] månedsnavn = { "Januar", "Februar", "Mars", "April", "Mai",
						  "Juni", "Juli", "August", "September",
						  "Oktober", "November", "Desember" };
	private Random generator = new Random();

	public String trekkMåned()
	{
		int indeks = generator.nextInt( månedsnavn.length );
		return månedsnavn[ indeks ];
	}
}