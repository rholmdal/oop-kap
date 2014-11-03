import javax.swing.*;

public class Tidstest
{
  public static void main( String[] args )
  {
    Tid t1, t2,t3, t4, t5, t6;
    String utskrift;

    t1 = new Tid();
    t2 = new Tid( 9 );
    t3 = new Tid( 9, 51 );
    t4 = new Tid( 9, 17, 27 );
    t5 = new Tid( 34, 60, 66 );
    //Metoden kan brukes på alle variabler av klassen Tid
	//Her: t1 til og med t5.
    t6 = new Tid( t4 );
    utskrift = "Konstruert med: " +
            "\nt1: alle argumenter lik default-verdier" +
            "\n    " + t1.universaltid() +
            "\n    " + t1.standardtid();
    utskrift += "\nt2: time spesifisert, minutt og sekund " + ""
            + "default-verdier" +
            "\n    " + t2.universaltid() +
            "\n    " + t2.standardtid();
    utskrift +=
            "\nt3: time og minutt spesifisert, sekund default-verdi" +
            "\n    " + t3.universaltid() +
            "\n    " + t3.standardtid();
    utskrift += "\nt4: time, minutt og sekund spesifisert" +
            "\n    " + t4.universaltid() +
            "\n    " + t4.standardtid();
    utskrift += "\nt5: ugyldige verdier spesifisert for alle tre" +
            "\n    " + t5.universaltid() +
            "\n    " + t5.standardtid();
    utskrift += "\nt6: Tid-objekt t4 spesifisert" +
            "\n    " + t6.universaltid() +
            "\n    " + t6.standardtid();
    JOptionPane.showMessageDialog( null, utskrift,
              "Demonstrasjon av overloading av konstruktører",
              JOptionPane.INFORMATION_MESSAGE );
  }
}