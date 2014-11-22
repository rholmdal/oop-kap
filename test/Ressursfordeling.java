/***** Oppgave Ressursfordeling ********
* Hovedklasse
* Programmet skal ta i bruk to datasett,
* ett med skolens behov for timefordeling pr. fag pr. �rstrinn og
* ett med tilgjengelige ressurser
* (dvs. tilgjengelige l�rere med ulik arbeidstid og kompetanse).
* Ressursene lagres i klassene L�rer, �rstrinn og Fag, for � bli hentet inn
* i klassen Fordeling som leser inn skolens behov og fordeler ressursene i
* henhold til disse. Resultatet av fordelinga skal s� lagres og visualiseres
* i klassen Fordeling.

< Opprette array av klassene �rstrinn-, fag - og l�rer  >
< Lese fra fil for � definere array st�rrelser og hente data til hvert objekts datafelter.
	Mulig utvidelse: Lage bruker-input >

< Fordele timer og ressurser. Gj�res i/av klassen Fordeling >
	< Opprette Fordelings-objekt og utf�re n�dvendige kall p� dets metoder >

< Gj�re kall p� Fordelings-objektets metoder for � skrive oversikter til fil/dialogboks >

*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ressursfordeling
{
	public static void main( String[] args )
	{
		String aarstrinnFilen = "aarstrinnRessurs.txt";
		String laererFilen = "l�rerRessurs.txt";
		String fagFilen = "fagRessurs.txt";//filen inneholder alle fagkoder

		// For � f� tilgang til metodene i klassen Filbehandling
		Filbehandling fil = new Filbehandling();

		//**** Leser filene for � dimmensjonere arrayene av ressursklassene.
		/* Klassen Filbehandlinginneholder to alternative metoder:
		 * antRogK( filnavn ) og antLinjer( filnavn ).
		 * Bruk av alt 1: int[] aarstrinnRoK = fil.antRogK( aarstrinnFilen );
		 * metoden finner antall rader og kolonner i fila (n�r data er skilt med et tegn,
		 * her ';' semikolon). csv-format: Comma/Character-Separated Values.
		 * og returnerer et int-array p� formen [antall rader, antall kolonner].
		 * Bruk av alt 2: int antAarstrinn = fil.antLinjer( aarstrinnFilen );
		 * Metoden returnerer antall linjer i fila sin et helltall
		 */
		int antAarstrinn = fil.antLinjer( aarstrinnFilen );
		int antFag = fil.antLinjer( fagFilen );
		// iie: int antLaerer = fil.antLinjer( laererFilen );


		//lager array-objekter av ressursklassene
		Aarstrinn[] trinnRessurs = new Aarstrinn[antAarstrinn];
		Fag[] fagRessurs = new Fag[antFag];
		// Ikke Implementert Enn� = iie: Laerer[] laererRessurs = new Laerer[antallL�rer];

		//**** Fyller objektene med informasjonen i datafilene
		trinnRessurs = fil.lesAarstrinnRessurs(aarstrinnFilen, trinnRessurs);
		fagRessurs = fil.lesFagRessurs(fagFilen, fagRessurs);

		//JOptionPane.showMessageDialog(null, test, "fra array",JOptionPane.PLAIN_MESSAGE );
		//JOptionPane.showMessageDialog(null, fil.melding(), "Konstrukt�r", JOptionPane.PLAIN_MESSAGE );

		String s = "";

		// ****** Test l�kke for � lese ut trinnRessurs registrereinger
		/*
		for( int x = 0; x < 4; x++)
		{
			for ( int y = 0; y < 5; y++ )
			{
				//JOptionPane.showMessageDialog(null, "", "", JOptionPane.PLAIN_MESSAGE );
				s += trinnRessurs[x].getFag(y) + ", " + trinnRessurs[x].getTimer(y) + "\n";
			}
		}
		*/

		// ****** Test l�kke for � lese ut fagRessurs registrereinger
		for( int x = 0; x < antFag; x++)
		{
				s += fagRessurs[x].getfagNavn() + "\n";
		}

		JOptionPane.showMessageDialog(null, s, "", JOptionPane.PLAIN_MESSAGE );



		//int antFag = antLinjer( fagFil );
		//int antL�rere = antLinjer( l�rerFil );*/

		/*Lager arrayene i riktig st�rrelse
		�rstrinn[] trinn;
		Fag[] fag = new Fag[antFag];
		L�rer[] l�rere = new L�rer[antL�rere];*/

	}
}