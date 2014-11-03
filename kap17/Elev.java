public class Elev
{
	private String elevNavn;
	private String elevFag;
	private int elevKarakter;

	//Initialiserer klassen
	public Elev()
	{
		this( "", "", 0 );
	}

	public Elev( String navn, String fag, int karakter)
	{
		SetElevNavn( navn );
		SetElevFag( fag );
		setElevKarakter( karakter );
	}

	// set og  get elevnavn
	public void SetElevNavn( String navn )
	{
		elevNavn = navn;
	}

	public int getElevNavn()
	{
		return elevNavn;
	}

	// set og get fag
	public void SetElevFag( String fag )
	{
		elevFag = fag;
	}

	public String getElevFag()
	{
		return elevFag;
	}

	// set og get karakter
	public void SetElevKarakter( int karakter )
	{
		elevKarakter = karakter;
	}

	public String getElevKarakter()
	{
		return elevKarakter;
	}
}