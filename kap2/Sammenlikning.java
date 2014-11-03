 import javax.swing.JOptionPane;
 
 public class Sammenlikning
 {
    public static void main( String args[] )
    {
       String f�rsteSifferstreng;   // brukes ved innlesing
       String andreSifferstreng;    // brukes ved innlesing
       String resultat;        // tekststreng som brukes til utskrift

       int f�rstetall;          // f�rste tall som skal sammenliknes
       int andretall;          // andre tall som skal sammenliknes

      f�rsteSifferstreng =
              JOptionPane.showInputDialog( "Skriv f�rste heltall:" );

      andreSifferstreng =
         JOptionPane.showInputDialog( "Skriv andre heltall:" );

      // konverterer sifferstrenger til heltallsverdier
      f�rstetall = Integer.parseInt( f�rsteSifferstreng );
      andretall = Integer.parseInt( andreSifferstreng );

      // initialiserer utskriftsstrengen til en tom streng
      resultat = "";

      if ( f�rstetall == andretall )
         resultat = resultat + f�rstetall + " == " + andretall;

      if ( f�rstetall != andretall )
         resultat = resultat + f�rstetall + " != " + andretall;

       if ( f�rstetall < andretall )
          resultat = resultat + "\n" + f�rstetall + " < " + andretall;

       if ( f�rstetall > andretall )
          resultat = resultat + "\n" + f�rstetall + " > " + andretall;

       if ( f�rstetall <= andretall )
          resultat = resultat + "\n" + f�rstetall + " <= " + andretall;

       if ( f�rstetall >= andretall )
          resultat = resultat + "\n" + f�rstetall + " >= " + andretall;

       // Viser resultat av sammenlikningene
       JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
          JOptionPane.INFORMATION_MESSAGE );
    } // slutt p� main-metoden
 } // slutt p� klassen Sammenlikning