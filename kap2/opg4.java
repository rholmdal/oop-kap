import javax.swing.JOptionPane;

public class opg4 //Addisjon av desimaltall
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng, andreSifferstreng;
      double f�rstetall, andretall, sum;

      // Leser inn f�rste tall fra bruker i form av en sifferstreng:
      f�rsteSifferstreng = JOptionPane.showInputDialog(
          "Skriv inn f�rste hele tall" );
      // Leser inn andre tall fra bruker i form av en sifferstreng:
       andreSifferstreng = JOptionPane.showInputDialog(
		   "Skriv inn andre hele tall" );

      // Konverterer sifferstrengene til tallverdier:
      f�rstetall = Double.parseDouble( f�rsteSifferstreng );
      andretall = Double.parseDouble( andreSifferstreng );
      // Adderer tallene og lagrer summen i variabelen sum:
      sum = f�rstetall + andretall;

      // Viser resultatet:
      JOptionPane.showMessageDialog( null, f�rstetall + " + " + andretall + " = " + sum,
      	"Resultater", JOptionPane.PLAIN_MESSAGE );
    } // slutt p� main-metoden
}  // slutt p� klassen opg4