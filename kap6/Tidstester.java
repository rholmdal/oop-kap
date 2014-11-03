import javax.swing.JOptionPane;

public class Tidstester
{
  public static void main( String[] args )
  {
    boolean flere = true;  // styrevariabel for do-while-løkke
    Tidsberegner klokke = new Tidsberegner();
    do
    {
      String timetall = JOptionPane.showInputDialog(
              "Skriv antall timer (heltall):" );
      String minuttall = JOptionPane.showInputDialog(
              "Skriv antall minutter (heltall):" );
      String sekundtall = JOptionPane.showInputDialog(
              "Skriv antall sekunder (heltall):" );
      int timer = Integer.parseInt( timetall );
      int min = Integer.parseInt( minuttall );
      int sek = Integer.parseInt( sekundtall );
      int sekunder = klokke.antSekunder( timer, min, sek );
      String utskrift = timetall + " timer, " + minuttall +
              " minutter, " + sekundtall + " sekunder = " +
              sekunder + " sekunder.";
      JOptionPane.showMessageDialog(
              null, utskrift, "Beregning av tid i sekunder",
              JOptionPane.PLAIN_MESSAGE );
      int svar = JOptionPane.showOptionDialog(
              null, "Vil du beregne flere tider?",
              "Tidsberegning", JOptionPane.YES_NO_OPTION,
              JOptionPane.QUESTION_MESSAGE, null, null, null );
      flere = (svar == JOptionPane.YES_OPTION);
    } while ( flere );
  }
}