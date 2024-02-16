import java.util.Scanner;

public class Ampulheta2
{
    public static void main(String [] arg)
    {
        int i, j, matriz[][], n;
        Scanner scan = new Scanner(System.in);

        matriz = new int[100][100];
        n = scan.nextInt();

        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println(soma(matriz, n));
    }

    public static int soma(int[][] matriz, int n)
    {
        int result = -63, somatorio = 0;
        int i, j;


        for(i=1; i<n-1; i++)
        {
            for(j=1; j<n-1; j++)
            {
                somatorio = somatorio + matriz[i-1][j-1];
                somatorio = somatorio + matriz[i-1][j];
                somatorio = somatorio + matriz[i-1][j+1];
                somatorio = somatorio + matriz[i][j];
                somatorio = somatorio + matriz[i+1][j-1];
                somatorio = somatorio + matriz[i+1][j];
                somatorio = somatorio + matriz[i+1][j+1];


                if(result < somatorio)
                {

                    result = somatorio;
                }
                somatorio = 0;
            }
        }
        return result;
    }
}