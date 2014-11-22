/*
Kapittel 17, ekstraoppgave

Lag et program som lager karakterprotokoll.

Programmet skal hente navnene fra en fil klasseliste, lese inn karakterene for hver elev
på en oppgave og lagre dem i en fil fagprotokoll.

Lag først et program som genererer en fil med klasseliste. Du skal også generere
en fil fagprotokoll. Så lenge det er flere elever på lista, les hvert elevnavn fra lista,
og les inn en karakter i et elevobjekt. Skriv elevnavn og tilknyttet karakter inn fila
norskprotokoll.

Lag et program som skriver alle dataene fra fila fagprotokoll ut på skjerm.

Utvid programmet slik at du kan lese inn karakterer for fem ulike oppgaver og
generere en samlekarakter.

*/
public class E17
{
	public static void main( String[] args )
	{
		Elev elevRegistrering = new Elev();
		DataBehandler d = new DataBehandler();

		d.lesKlasseliste();
		d.lagProtokoll("norsk");
	}
}