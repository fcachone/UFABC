import java.util.Scanner;

public class HelloEarth
{
    public static void main(String args[])
    {
        int N, i, A, T, D, menor;
        String M, K;
        Scanner scan = new Scanner(System.in);

        M = new String("");
        K = new String("");
        menor = 0;

        do
        {
            N = scan.nextInt();
            i = 0;
            while(i < N)
            {
                i = i + 1;
                M = scan.next();
                A = scan.nextInt();
                T = scan.nextInt();

                D = A - T;

                if(i == 1)
                {
                    menor = D;
                    K = M;
                }

                else if(D < menor)
                {
                    menor = D;
                    K = M;
                }
            }
            if (N != 0)
            {
                System.out.println(K);
            }
        } while(N != 0);
    }
}

