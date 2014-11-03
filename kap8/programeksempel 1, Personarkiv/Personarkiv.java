/* Kap. 8, Programeksempel 1
*  Har omarbeidet det slik at registreringer kan skrives til
*  og hentes fra filen data.cvs.
*  Det innebærer følgende endringer i
*	- Personarkiv.java: Økt vindustørrelse.
*	- Persondata.java: Lagt til to nye knapper, utvidet
*		actionPerformed( ActionEvent e )metodene til
*		også utføre metodene lagreRegisterFil()
*		og leseRegisterFil().
*	- Personregister.java: Er utvidet med metodene
*		public String hentPerson(int n) og
*		public String hentPersonNr(int n) for å kunne hente
*		ut register registreringer ved skriving til fil.
*  	Det benyttes ; som data-skille i filformatet csv
*  	(character-separated values) som gjør at fila leses og
*	genereres i regneark (excel).
*	En linje tilsvarer en rad, og ; skiller mellom kolonner.
*/
import javax.swing.JFrame;

public class Personarkiv
{
  public static void main( String[] args )
  {
    Persondata vindu = new Persondata();
    vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    vindu.setSize( 290, 390 );
    vindu.setVisible( true );
  }
}