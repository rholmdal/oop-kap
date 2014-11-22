import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class Eo17LagKlasseListe
{
	public static void main( String[] args )
	{
		KlasseListe program = new KlasseListe();

		program.lagKlasseListeFil();

	}
}