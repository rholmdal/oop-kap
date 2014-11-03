/*
Kap. Vindusprogrammer, oppgave 3
Lag et hendelsesbasert program som kan beregne arealer for
rektangler. Programmet skal fra hvert sitt tekstfelt lese inn
rektangelets bredde og h�yde i form av desimaltall. Innlesing
og beregning av areal skal skje som f�lge av at brukeren
klikker p� en knapp med passende tekst p�.
Det beregnede arealet skal skrives ut i et tredje tekstfelt
som er ikke-editerbart. Bruk passende ledetekster foran
tekstfeltene. For selve arealberegningen skal det defineres
en egen metode med parametre for bredde og h�yde, og som
returnerer arealet. Metoden skal sjekke at bredde og h�yde
ikke er negative. Dersom minst �n av dem er negativ, skal
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