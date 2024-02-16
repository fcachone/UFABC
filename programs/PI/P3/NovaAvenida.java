import java.util.Arrays;
import java.util.Scanner;

public class NovaAvenida
{

	public static void main(String[] args)
	{
		int i, j, m, n;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		int numeros[][] = new int[n][m];
		int minimo[] = new int[m];

		for(i=0 ; i<n ; i++)
		{
			for(j=0 ; j<m ; j++)
			{
				numeros[i][j] = scan.nextInt();
			}
		}

		for(i=0 ; i<n ; i++)
		{
			for(j=0 ; j<m ; j++)
			{
				minimo[j] += numeros[i][j];
			}
		}

		Arrays.sort(minimo);

		System.out.println(minimo[0]);

	}

}
