import java.util.Scanner;

public class Crediario
{
    public static void main(String args[])
    {
        int divida, prest;

        Scanner scan = new Scanner(System.in);
        divida = scan.nextInt();
        prest = scan.nextInt();
        scan.close();

        for (int i = 0; i < (divida % prest); i++)
            System.out.println((divida / prest) + 1);

        for (int i = 0; i < (prest - (divida % prest)); i++)
            System.out.println((divida / prest));
    }
}