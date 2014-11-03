
// Programmet leser en tekstfil og viser hver post p� skjerm
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.*;


public class LesTekstFil
{
 private Scanner input; //objekt av klassen Scanner brukes til � lese fra fil

// her �pnes fila
public void aapneFil()
{
try
{
input = new Scanner (new File("kunder.txt"));
} // end try
catch ( FileNotFoundException fileNotFoundException )
{
JOptionPane.showMessageDialog(null,  "Feil ved �pning av fila.", null, JOptionPane.PLAIN_MESSAGE );
System.exit( 1 );
} // end catch
}


// leser poster fra fila
public void lesPoster()
{
// objekt som skal skrives p� skjerm
KontoPost post = new KontoPost();

JTextArea tekstomr�de = new JTextArea();
tekstomr�de.setText("Kontonr\t Fornavn\t Etternavn\t Balanse\n");

try // leser objekter fra fila vha input som er et Scanner-objekt
{
while(input.hasNext() )
{
post.setKonto( input.nextInt() );
post.setForNavn(input.next());
post.setEtterNavn(input.next() );
post.setBalanse(input.nextDouble());

tekstomr�de.append(post.getKonto() +"\t" + post.getForNavn()+"\t" + post.getEtterNavn()+"\t" + post.getBalanse() +"\n");

} // end while
JOptionPane.showMessageDialog(null,  tekstomr�de, null, JOptionPane.PLAIN_MESSAGE);
} // end try

catch ( NoSuchElementException elementException )
{
JOptionPane.showMessageDialog(null, "Upassende format i fila", null, JOptionPane.PLAIN_MESSAGE);
input.close();
System.exit( 1 );
} // end catch
catch ( IllegalStateException stateException )
{
JOptionPane.showMessageDialog(null, "Feil i lesing fra fil", null, JOptionPane.PLAIN_MESSAGE);
System.exit( 1 );
} // end catch
} // end lesPoster



// lukk fila og avslutt
public void lukkFil()
{
if ( input != null )
input.close();

}
}