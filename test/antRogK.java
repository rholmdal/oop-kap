private int[] antRogK(String filNavn)
/* Finner antall rader og maks antall kolonner i filen. */
{
	BufferedReader br = null;
	String lestData = "";
	int[] rk= { 0, 0 };
	try
	{
		br = new BufferedReader( new FileReader(FilNavn) );
		while( ( lestData = br.readLine() ) != null )
		{
			String[] data = lestData.split(";");
			if ( data[0] <> "" )
				rk[0]++;
			if (data.length > kolonne)
				rk[1] = data.length;
		}
		return rk;
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