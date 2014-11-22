import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class KlasseListe
{
	public void lagKlasseListeFil()
	{
		String csvFile = "klasseliste.txt";
		BufferedWriter bw = null;
		try
		{
			bw = new BufferedWriter(new FileWriter(csvFile));
			String navn = JOptionPane.showInputDialog("Navn på elev:");
			while ( navn != null )
			{
				bw.write( navn );
				bw.newLine();
				navn = JOptionPane.showInputDialog("Navn på neste elev:");
			}
			if ( navn == null )
			{
				JOptionPane.showMessageDialog(null, "filen er nå generert!",
					"Melding", JOptionPane.PLAIN_MESSAGE );
			}
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "",
				e.toString(), JOptionPane.PLAIN_MESSAGE );
		}
		finally
		{
			if ( bw != null )
			{
				try
				{
					bw.close();
				}
				catch (IOException e)
				{
					JOptionPane.showMessageDialog(null, "",
						e.toString(), JOptionPane.PLAIN_MESSAGE );
				}
			}
		}
	}
}