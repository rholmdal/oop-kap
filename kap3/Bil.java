import javax.swing.JOptionPane;

public class Bil
{
	private String merke;
	private String modell;

	public Bil(String bilMerke, String bilModell)
	{
		merke = bilMerke;
		modell = bilModell;
	}

	public void registrerBil( String bilMerke, String bilModell )
	{
		merke = bilMerke;
		modell = bilModell;
	}

	public String lesRegistrertMerke()
	{
		return merke;
    }

    public String lesRegistrertModell()
	{
			return modell;
    }
}