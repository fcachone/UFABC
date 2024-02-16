import java.util.Scanner;

public class DiaSeguinte
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int D, M, A;

        D = scan.nextInt();
        M = scan.nextInt();
        A = scan.nextInt();

        if((A%400 == 0) || ((A%4 == 0) && (A%100 != 0)))
        {
            if(D == 31 && (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10))
            {
                M = M + 1;
                D = 1;
                System.out.println(D+" "+M+" "+A);
            }
            else if(D == 30 && (M == 4|| M == 6 || M == 9 || M == 11))
            {
                M = M + 1;
                D = 1;
                System.out.println(D+" "+M+" "+A);
            }
            else if(D == 29 && M == 2)
            {
                M = M + 1;
                D = 1;
                System.out.println(D+" "+M+" "+A);
            }
            else if(D == 31 && M == 12)
            {
                M = 1;
                D = 1;
                A = A + 1;
                System.out.println(D+" "+M+" "+A);
            }
             else
            {
                D = D + 1;
                System.out.println(D+" "+M+" "+A);
            }
        }
        else
        {
            if(D == 31 && (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10))
            {
                M = M + 1;
                D = 1;
                System.out.println(D+" "+M+" "+A);
            }
            else if(D == 30 && (M == 4|| M == 6 || M == 9 || M == 11))
            {
                M = M + 1;
                D = 1;
                System.out.println(D+" "+M+" "+A);
            }
            else if(D == 28 && M == 2)
            {
                M = M + 1;
                D = 1;
                System.out.println(D+" "+M+" "+A);
            }
            else if(D == 31 && M == 12)
            {
                M = 1;
                D = 1;
                A = A + 1;
                System.out.println(D+" "+M+" "+A);
            }
            else
            {
                D = D + 1;
                System.out.println(D+" "+M+" "+A);
            }
        }
    }
}