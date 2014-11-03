import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class ReadCVS
{

	public static void main(String[] args)
	{
		ReadCVS obj = new ReadCVS();
		obj.run();
	}

	public void run()
	{
		PontoPost post = new PontoPost();
		JTextArea tekstområde = new JTextArea();
		tekstområde.setText("");

		String csvFile = "data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";

		try
		{
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null)
			{
				// split line by separator
				String[] t = line.split(cvsSplitBy);
				post.setKonto( Integer.parseInt( t[0] ) );
				post.setForNavn( t[1] );
				post.setEtterNavn( t[2] );
				//post.setBalanse( Double.parseDouble( t[3] ) );
				tekstområde.append(post.getKonto() +"\t" + post.getForNavn()+"\t" +
				post.getEtterNavn() + "\n");
			}
			JOptionPane.showMessageDialog(null, tekstområde, null, JOptionPane.PLAIN_MESSAGE);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}