/*
Kap. Vindusprogrammer, oppgave 3
Lag et hendelsesbasert program som kan beregne arealer for
rektangler. Programmet skal fra hvert sitt tekstfelt lese inn
rektangelets bredde og høyde i form av desimaltall. Innlesing
og beregning av areal skal skje som følge av at brukeren
klikker på en knapp med passende tekst på.
Det beregnede arealet skal skrives ut i et tredje tekstfelt
som er ikke-editerbart. Bruk passende ledetekster foran
tekstfeltene. For selve arealberegningen skal det defineres
en egen metode med parametre for bredde og høyde, og som
returnerer arealet. Metoden skal sjekke at bredde og høyde
ikke er negative. Dersom minst én av dem er negativ, skal
metoden returnere tallverdien null som verdi for arealet.
*/

import javax.swing.JFrame;

public class Opg3
{
	public static void main( String[] args )
	{
		Form vindu = new Form();
		vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		vindu.setSize( 250, 160 );
		vindu.setVisible( true );
	}
}