import java.util.Scanner;

public class Tacografo
{
    public static void main(String args[])
    {
        int T, V, N, i, P, S;
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        i = 1;
        S = 0;

        while(i <= N)
        {
            i = i + 1;
            T = scan.nextInt();
            V = scan.nextInt();
            P = T*V;
            S = S + P;
        }
        System.out.println(S);
    }
}