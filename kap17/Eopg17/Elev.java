public class Elev
{
	private String navn;
	private String kar;

	// konstrukt�r uten parametre, initialiserer klassen
	public Elev()
	{
		this( "", "" );
	}

	// konstrukt�r med argumenter
	public Elev( String n, String k )
	{
		setNavn( n );
		setKar( k );
	}

	// set navn
	public void setNavn( String n )
	{
		navn = n;
	}

	// get fornavn
	 public String getNavn()
	{
		return navn;
	}

	// set karakter
	public void setKar( String k )
	{
		kar = k;
	}

	// get etternavn
	public String getKar()
	{
		return kar;
	}
}