import java.util.Scanner;
public class Lua2
{
    public static void main (String args[])
    {
        int N, M1, M2;
        Scanner scan = new Scanner (System.in);

        N = scan.nextInt();

        for(int i=0;i<N;i++)
        {
            M1=scan.nextInt();
            M2=scan.nextInt();

            if (M1 >= 0 && M2 <= 2)
            {
                System.out.println("Nova");
            }
            else if (M2 > M1 && M2 <= 96)
            {
                System.out.println("Crescente");
            }
            else if (M1 >= M2 && M2 <= 96)
            {
                System.out.println("Minguante");
            }
            else
            {
               System.out.println("Cheia");
        }
    }
}
}