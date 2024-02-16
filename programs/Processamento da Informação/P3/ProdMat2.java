import java.util.Scanner;
public class ProdMat2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int la,ca,lb,cb;

        la = scan.nextInt();
        ca = scan.nextInt();
        lb = scan.nextInt();
        cb = scan.nextInt();

        int a[][] = new int[la][ca];
        int b[][] = new int[lb][cb];

        for(int i=0; i<la; i++)
        {
            for(int j=0; j<ca; j++)
            {
                a[i][j]= scan.nextInt();
            }
        }

        for(int i=0; i<lb; i++)
        {
            for(int j=0; j<cb; j++)
            {
                b[i][j]= scan.nextInt();
            }
        }

        if (a[0].length != b.length)
        {
            System.out.println("impossivel multiplicar as matrizes");
        }
        else
        {
            int produto[][] = calculaProduto(a,b);

            for(int i=0; i<la; i++)
            {
                for(int j=0; j<cb; j++)
                {
                    if(j==cb-1)
                    {
                        System.out.println(produto[i][j]);
                    }
                    else
                    {
                        System.out.print(produto[i][j]+" ");
                    }
                }
            }
        }


    }
    public static int[][] calculaProduto(int[][] a, int[][] b)
    {

        int[][] result = new int[ a.length ][ b[0].length ];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b[0].length; j++)
            {
                for (int k = 0; k < a[0].length; k++)
                {
                    result[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return result ;
    }
}