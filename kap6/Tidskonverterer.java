public class Tidskonverterer
{
	public String konvertertTid( int antSekunder )
	{
		int timer;
		int minutter;
		int sekunder;

		timer = antSekunder / 3600; //antall timer
		sekunder = antSekunder % 3600; //rest sekunder
		minutter = (antSekunder % 3600) / 60; //antall minutter
		sekunder = sekunder % 60; //antall sekunder

		String resultat = timer + ", " + minutter + ", " + sekunder;

		return resultat;
	}
}