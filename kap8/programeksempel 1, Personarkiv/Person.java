public class Person
{
	private String navn;
	private int personnr;

	//KonstruktÝr
	public Person( String n, int nr )
	{
		navn = n;
		personnr = nr;
	}

	public String getNavn()
	{
		return navn;
	}

	public int getNummer()
	{
		return personnr;
	}

	public String toString()
	{
		return "Navn: " + navn + ", personnummer: " + personnr;
	}
}