/*
Kap. 6, oppgave 2
Omskriving av eksempel 4 i kapittel 4.
Lag et program som gjentatte ganger leser inn et antall sekunder og
skriver ut dette konvertert til timer, minutter og sekunder.
Programmet avsluttes når brukeren skriver et negativt tall.

Omarbeide dette programmet på følgende måte:
Skriv en klasse Tidskonvertering og et testprogram for klassen Tidskonverterer.
Programmet skal opprette et Tidskonverterer-objekt.
Programmet skal gjentatte ganger kunne lese inn et antall sekunder fra brukeren.
Det innleste antallet skal konverteres til timer, minutter og sekunder,
ved at programmet gjør kall på Tidskonverterer-objektets metode konvertertTid,
med den innleste verdi som aktuell parameter. Resultatet av konverteringen skal
skrives ut i en dialogboks.

Gitt pseudo-kode til klassen Tidskonverterer:

public class Tidskonverterer
{
  public String konvertertTid( int antSekunder )
  {
    < Returnerer en tekst som uttrykker det mottatte antall sekunder
         i timer, minutter og sekunder. >
  }
}
*/

import javax.swing.JOptionPane;

public class Opg2
{
	public static void main(String[] args)
	{
		int sekunder = Integer.parseInt( JOptionPane.showInputDialog(
				  "Skriv inn radiussen til sirkelen (. hvis desimaltall):" ) );

		while (sekunder >= 0)
		{
			Tidskonverterer TilSekunder = new Tidskonverterer();
			String utskrift = TilSekunder.konvertertTid(sekunder);

			JOptionPane.showMessageDialog( null, utskrift,
				"Bergninger for sirkel med:", JOptionPane.PLAIN_MESSAGE );

			sekunder = Integer.parseInt( JOptionPane.showInputDialog(
				  "Skriv inn radiussen til sirkelen (. hvis desimaltall):" ) );
		}
	}
}