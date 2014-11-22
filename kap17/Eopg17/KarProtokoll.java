import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class KarProtokoll
{
	//String[][] elev = new String[30][2];//tabell 30 rader og to kolonner
	Elev[] e = new Elev[30];

	public void lagKarProtokollFil()
	{
		int i = 0;
		String navn = "";
		String csvFile1 = "klasseliste.txt";
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(csvFile1));
			//while ( (elev[i][0] = br.readLine()) != null )
			while( ( navn = br.readLine() ) != null )
			{
				//elev[i][1] = JOptionPane.showInputDialog("Karakteren til\n" + elev[i][0] + ":");
				String kar = JOptionPane.showInputDialog("Karakteren til\n" + navn + ":");
				e[i] = new Elev(navn, kar);
				i++;
			}

			//Skriver tabellen til fil på csv-formatet
			String csvFile2 = "klasseprotokoll.txt";
			BufferedWriter bw = null;
			i = 0;
			try
			{
				bw = new BufferedWriter(new FileWriter(csvFile2));
				//while ( elev[i][0] != null )
				while ( e[i] != null )
				{
					//bw.write( elev[i][0] + ";" + elev[i][1] + "\n" );
					bw.write( e[i].getNavn() + ";" + e[i].getKar() + "\n" );
					i++;
				}
				if ( e[i] == null )
				{
					JOptionPane.showMessageDialog(null, "Filen " + csvFile2 + " er nå generert!",
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
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "",
				e.toString(), JOptionPane.PLAIN_MESSAGE );
		}
		finally
		{
			if ( br != null )
			{
				try
				{
					br.close();
				}
				catch (IOException e)
				{
					JOptionPane.showMessageDialog(null, "",
						e.toString(), JOptionPane.PLAIN_MESSAGE );
				}
			}
		}
	}

	public void lesKarProtokollFil()
	{
		String linje = "";
		String csvFile = "klasseprotokoll.txt";
		BufferedReader br = null;
		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("Navn \t Karakter \n");

		try
		{
			br = new BufferedReader(new FileReader(csvFile));
			//while ( (elev[i][0] = br.readLine()) != null )
			while( ( linje = br.readLine() ) != null )
			{
				String[] r = linje.split(";");
				tekstområde.append( r[0] + "\t " + r[1] + "\n" );
			}
			JOptionPane.showMessageDialog(null, tekstområde, null, JOptionPane.PLAIN_MESSAGE);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "",
				e.toString(), JOptionPane.PLAIN_MESSAGE );
		}
		finally
		{
			if ( br != null )
			{
				try
				{
					br.close();
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