/*
Kap. 7, oppgave 5

Lag et program som leser inn en tekststreng fra brukeren. Programmet skal telle opp og
skrive ut antall forekomster det i den innleste tekststrengen er av de forskjellige
bokstavene i alfabetet, altså antall a-er, antall b-er, etc. Det skal skilles mellom
små og store bokstaver.
(Programmet skal altså telle opp både antall a-er og A-er, og tilsvarende for de
andre bokstavene.)
*/

import javax.swing.JOptionPane;

public class Opg5
{
	public static void main(String[] args)
	{
		//String input = "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, æ, ø, å, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, Æ, Ø, Å";

 		String input = JOptionPane.showInputDialog(
			"Programmet teller og skriver " +
			"ut bokstavfrekvensen i tekststrengen du skriver." );

		char[] bokstavL = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å' };
		char[] bokstavS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å' };
		int[] antallL = new int[bokstavL.length];
		int[] antallS = new int[bokstavS.length];
		String resultat = "Bokstavfrekvensen i teksten.\nSmå \t \t Store:\n";

		for ( int i = 0; i < input.length(); i++ )
		{
			char tegn = input.charAt( i );

			for ( int j = 0; j < bokstavL.length; j++ )
			{
				if ( tegn == bokstavL[ j ] )
				{
					antallL[j]++;
				}
				if ( tegn == bokstavS[ j ] )
				{
					antallS[j]++;
				}

			}
		}

		for (int i = 0; i < antallL.length; i++)
		{
			resultat += bokstavL[i] + " = " + antallL[i] + "\t" + "\t" + bokstavS[i] + " = " + antallS[i] + "\n";
		}

		JOptionPane.showMessageDialog( null, resultat,
			"Opptelling", JOptionPane.PLAIN_MESSAGE );

	}
}