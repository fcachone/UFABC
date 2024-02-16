import java.util.Scanner;

public class Logotipo
{

	public static void main(String args[])
	{
		int i, j, k, m, n, o;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		int logo[][] = new int[n][n];
		boolean testeLogo[][] = new boolean[n][n];

		for(i = 0; i<n; i++)
		{
			for(j = 0; j<n; j++)
			{
				logo[i][j] = scan.nextInt();
			}
		}

		m = scan.nextInt();

		boolean apenasTrue = true;
		boolean temFalse = false;
		boolean temLogo = false;

		int tv[][] = new int[m][m];
		for(i = 0; i<m; i++)
		{
			for(j = 0; j<m; j++)
			{
				tv[i][j] = scan.nextInt();
			}
		}

		int total = n*n;
		int contador = 0;

		for(i = 0; i<m; i++)
		{
			for(j = 0; j<m; j++)
			{
				if(tv[i][j] == logo[0][0])
				{
					//ver para direita toda linha
					try{
						for(o = 0; o<n; o++)
						{
							for(k = 0; k<n; k++)
							{
								if(tv[i+o][j+k] == logo[0+o][0+k])
								{
									testeLogo[o][k] = true;
								}
							}
						}

						for(int q = 0; q<n; q++)
						{
							for(int w = 0; w<n; w++)
							{
								if(testeLogo[q][w] != false)
								{
									contador++;
								}
							}
						}
					}catch(Exception e){

					}


					if(contador == total)
					{
						temLogo = true;
					}
					contador = 0 ;
				}
			}
		}

		if(temLogo) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
	}
}
