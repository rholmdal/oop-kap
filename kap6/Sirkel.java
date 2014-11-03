/*
Kap. 6, oppgave 1
Klassen Sirkel:
Definer en klasse Sirkel som skal representere en sirkel.
Klassen skal ha et datafelt av type double for sirkelens radius.
Dette skal tildeles verdi via en konstruktørparameter.
Konstruktøren skal sjekke om den radien den mottar som parameter er >= 0.0.
Dersom dette ikke er tilfelle, skal sirkelens radius settes lik 0.0.
Klassen skal ha en get-metode som returnerer sirkelens radius.
Klassen skal i tillegg ha følgende metoder, skissert i pseudo-kode:

*/
public class Sirkel
{
	private double r;

	// Konstruktør som initialiserer datafeltet kursnavn.
	public Sirkel( double radien )
	{
		if (radien < 0.0)
			r = 0.0;
		else
			r = radien;
	}

	public double diameter()
	{
		return 2 * r;
	}

	public double omkrets()
	{
		return 2 * Math.PI * r;
	}

	public double areal()
	{
		return Math.PI * r * r;
	}
}