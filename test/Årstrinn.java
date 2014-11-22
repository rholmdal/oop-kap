public class �rstrinn
{
	private int maksoppf�ringer = 5;
	private String[] fag = new String[maksoppf�ringer];
	private String[] timer = new String[maksoppf�ringer];

	// konstrukt�r uten parametre, initialiserer klassen
	public �rstrinn(int maksoppf�ringer)
	{
		for ( int i = 0; i < maksoppf�ringer; i++ )
		{
			fag[i] = "";
			timer[i] = "";
		}
	}

	public �rstrinn( String[] d )
	{
		for ( int i = 0; i < maksoppf�ringer; i++ )
		{
			for ( int x = 0; x < 10; x++ )
			{
				setFag( i, d[i] );
				setTimer( i, d[i+1] );
			}
		}
	}
	// konstrukt�r med argumenter
	public �rstrinn( int indeks, String f, String t )
	{
		setFag( indeks, f );
		setTimer( indeks, t );
	}

	public void setFag( int indeks, String f )
	{
		fag[indeks] = f;
	}

	public String getFag(int indeks)
	{
		return fag[indeks];
	}

	public void setTimer( int indeks, String t )
	{
		timer[indeks] = t;
	}

	public String getTimer(int indeks)
	{
		return timer[indeks];
	}
}