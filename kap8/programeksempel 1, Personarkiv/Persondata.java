import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Persondata extends JFrame implements ActionListener
{
	private JTextField navnefelt, nummerfelt;
	private JTextArea utskrift;
	private JButton ny, vis, finn, lagre, lese;
	private Personregister register;

	public Persondata()
	{
		super( "Persondata" );
		navnefelt = new JTextField( 20 );
		nummerfelt = new JTextField( 12 );
		utskrift = new JTextArea( 10, 25 );
		utskrift.setEditable( false );
		ny = new JButton( "Registrer ny person" );
		ny.addActionListener( this );
		vis = new JButton( "Vis alle registrerte personer" );
		vis.addActionListener( this );
		finn = new JButton( "Finn person med gitt nummer" );
		finn.addActionListener( this );
		lagre = new JButton( "Lagre til fil" );
		lagre.addActionListener( this );
		lese = new JButton( "Lese fra fil" );
		lese.addActionListener( this );
		register = new Personregister();
		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add( new JLabel( "Navn:" ) );
		c.add( navnefelt );
		c.add( new JLabel( "Nr.:" ) );
		c.add( nummerfelt );
		c.add( ny );
		c.add( vis );
		c.add( finn );
		c.add( new JScrollPane( utskrift ) );
		c.add( lagre );
		c.add( lese );
	}

	public void nyPerson()
	{
		String navn = navnefelt.getText();
		int nr = Integer.parseInt( nummerfelt.getText() );
		Person ny = new Person( navn, nr );
		boolean ok = register.nyPerson( ny );
		if ( ok )
			utskrift.setText( navn + " ble registrert." );
		else
			utskrift.setText( "Ingen registrering pga. fullt register!" );
	}

	public void visRegister()
	{
		utskrift.setText( "Registrerte personer:\n" );
		utskrift.append( register.visAlleNavn() );
	}

	public void finnPerson()
	{
		int nr = Integer.parseInt( nummerfelt.getText() );
		String data = register.visPerson( nr );
		if ( data != null )
			utskrift.setText( data );
		else
			utskrift.setText( "Finnes ikke i registeret!" );
	}

	public void lagreRegisterFil()
	{
		String csvFile = "data.csv";
		BufferedWriter bw = null;
		try
		{
			//true = append file
    		//FileWriter fileWritter = new FileWriter(file.getName(),true);
			bw = new BufferedWriter(new FileWriter(csvFile, true));
			for (int i = 0; i < 5; i++)
			{
				bw.write(register.hentPerson(i) + ";" + register.hentPersonNr(i) + "\n");
			}
			utskrift.setText("Registreringer er skrevet til fil\n");
			bw.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void leseRegisterFil()
	{
		utskrift.setText("Registreringer på fil\n");

		String csvFile = "data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
		int i = 0;

		try
		{
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null)
			{
				// split line by separator
				String[] r = line.split(cvsSplitBy);
				Person ny = new Person( r[0], Integer.parseInt( r[1] ) );
				boolean ok = register.nyPerson( ny );
				if ( ok )
					utskrift.append( r[0] + "\n" );
				else
					utskrift.append( "Fullt register!" );
			}
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

	public void actionPerformed( ActionEvent e )
	{
		if ( e.getSource() == ny )
			nyPerson();
		else if ( e.getSource() == vis )
			visRegister();
		else if ( e.getSource() == finn )
			finnPerson();
		else if ( e.getSource() == lagre )
			lagreRegisterFil();
		else if ( e.getSource() == lese )
			leseRegisterFil();
	}
}