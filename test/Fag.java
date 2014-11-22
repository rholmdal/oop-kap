/* Denne klassen samler tilgjengelige ressurser per faggruppe, uavhengig av trinnfordeling. Klassen brukes i fordelinga.
* Kodingen er utf�rt av Jenny Emelia Nikolaisen
* Dette er versjon nr. 5 (17.11.14)
*/

public class Fag
{
	private String fagNavn;
	private int laererIndeks;

	//konstrukt�r
	public Fag()
	{
		fagNavn = "";
		laererIndeks = 0;
	}

	//Konstrukt�r
	public Fag(String f, int l)
	{
		fagNavn = f;
		//Rune: Bruker denne for midlertidig testing
		laererIndeks = l;
		//Dette er den endelige
		//laererIndeks = metode_som_finner_indeksen_til(f);//??
	}

	public void setFag(String f)
	{
		fagNavn = f;
		//laererIndeks = metode_som_finner_indeksen_til(f);//???
	}

	public String getfagNavn() // lager en get-metode som returnerer faget
	{
		return fagNavn;
	}
	/* m� kommentere ut denne s� lenge siden objektet laerer ikke er opprettet enn�
	public String getLaerere() // lager en get-metode som returnerer l�rere
	{
		return laerere;
	}
	*/

	/* m� kommentere ut denne s� lenge siden objektet laerer ikke er opprettet enn�
	public int tilgjengeligLaerer(Laerer[] laerer) // Returnerer indeks til mest tilgjengelige l�rer. Public fordi Andreas skal ha tilgang.
		{
			int laererIndeks = 0;
			int flestTimer = 0;

			for (int i = 0 ; i < laerer.length ; i++) // G�r igjennom alle l�rerne
			{
				if (laerer[i].fordypning == fagNavn) // muligens endres, se Trudes koding for eksakte navn
				{

					if (laerer[i].timer > flestTimer)
					{
						flestTimer = laerer[i].timer;
						laererIndeks = i;
					}

				}
			}

			return laererIndeks;

	}	// Slutt p� tilgjengeligLaerer
	*/

} // Slutt p� klassen Fag