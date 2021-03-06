public class KontoPost
{
	private int konto;
	private String forNavn;
	private String etterNavn;
	private double balanse;

	// konstruktÝr uten parametre, initialiserer klassen
	public KontoPost()
	{
		this( 0, "", "", 0.0 ); // kaller kontstruktÝr med fire argumenter
	} // end konstruktÝr uten argumenter

	 // konstruktÝr med fire argumenter
	public KontoPost( int knt, String fnavn, String enavn, double bal )
	{
		setKonto( knt );
		setForNavn( fnavn );
		setEtterNavn( enavn );
		setBalanse( bal );
	} // end 4-argumenters konstruktÝr

	// set kontomummer
	public void setKonto( int knt )
	{
		konto = knt;
	}

	 // get kontonummer
	public int getKonto()
	{
		return konto;
	}

	// set fornavn
	public void setForNavn( String fnavn )
	{
		forNavn = fnavn;
	}

	// get fornavn
	 public String getForNavn()
	{
		return forNavn;
	}

	// set etternavn
	public void setEtterNavn( String enavn )
	{
		etterNavn = enavn;
	}

	// get etternavn
	public String getEtterNavn()
	{
		return etterNavn;
	}

	// set balanse
	public void setBalanse( double bal )
	{
		balanse = bal;
	 }

	// get balanse
	public double getBalanse()
	{
		return balanse;
	}
}