import javax.swing.JOptionPane;

public class opg4 //Addisjon av desimaltall
{
   public static void main( String args[] )
   {
      String førsteSifferstreng, andreSifferstreng;
      double førstetall, andretall, sum;

      // Leser inn første tall fra bruker i form av en sifferstreng:
      førsteSifferstreng = JOptionPane.showInputDialog(
          "Skriv inn første hele tall" );
      // Leser inn andre tall fra bruker i form av en sifferstreng:
       andreSifferstreng = JOptionPane.showInputDialog(
		   "Skriv inn andre hele tall" );

      // Konverterer sifferstrengene til tallverdier:
      førstetall = Double.parseDouble( førsteSifferstreng );
      andretall = Double.parseDouble( andreSifferstreng );
      // Adderer tallene og lagrer summen i variabelen sum:
      sum = førstetall + andretall;

      // Viser resultatet:
      JOptionPane.showMessageDialog( null, førstetall + " + " + andretall + " = " + sum,
      	"Resultater", JOptionPane.PLAIN_MESSAGE );
    } // slutt på main-metoden
}  // slutt på klassen opg4