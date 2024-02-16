import java.util.Scanner;

public class Escadinha
{
    public static void main(String args[])
    {
        int N, i, D, Di;
        Scanner scan = new Scanner(System.in);

        Di = 0;
        N = scan.nextInt();

        if(N == 1)
        {
            D = scan.nextInt();
            System.out.println("S");
        }
        else
        {
            for(i = 0; i < N; i = i + 1)
            {
                D = scan.nextInt();

                if(i == 0)
                {
                    Di = D;
                }
                else if(D - Di == 1)
                {
                    Di = D;
                    if(i == N-1)
                    {
                        System.out.println("S");
                    }
                }
                else
                {
                    System.out.println("N");
                    break;
                }
            }
        }
    }
}