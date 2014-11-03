// ENUM-liste for menyvalg

public enum MenyValg
{
	// deklarerer ENUM-lista
	NULL_BALANSE( 1 ),
	KREDITT_BALANSE( 2 ),
	DEBIT_BALANSE( 3 ),
	SLUTT( 4 );

	private final int verdi; // gjeldende meyvalg

	// konstruktør
	MenyValg( int verdiValg )
	{
		verdi = verdiValg;
	}

	// returnerer verdien av en konstant
	public int getVerdi()
	{
		return verdi;
	}
}