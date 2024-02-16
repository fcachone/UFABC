import java.util.Scanner;

public class Idade
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int M, A, B, C;

        M = scan.nextInt();
        A = scan.nextInt();
        B = scan.nextInt();

        C = M - A - B;

        if(A > B && A > C)
        {
            System.out.println(A);
        }
        else if(B > A && B > C)
        {
             System.out.println(B);
        }
        else if(C > A && C > B)
        {
             System.out.println(C);
        }
    }
}