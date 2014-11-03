public class PontoPost
{
	private int konto;
	private String forNavn;
	private String etterNavn;
	//private double balanse;

	// konstrukt�r uten parametre, initialiserer klassen
	public PontoPost()
	{
		this( 0, "", "" ); // kaller kontstrukt�r med fire argumenter
	} // end konstrukt�r uten argumenter

	 // konstrukt�r med fire argumenter
	public PontoPost( int knt, String fnavn, String enavn )//, double bal )
	{
		setKonto( knt );
		setForNavn( fnavn );
		setEtterNavn( enavn );
		//setBalanse( bal );
	} // end 4-argumenters konstrukt�r

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

	/*// set balanse
	public void setBalanse( double bal )
	{
		balanse = bal;
	 }

	// get balanse
	public double getBalanse()
	{
		return balanse;
	}*/
}