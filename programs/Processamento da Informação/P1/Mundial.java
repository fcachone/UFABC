import java.util.Scanner;

public class Mundial
{
    public static void main(String args[])
    {
        int J, P, V, E, D;
        Scanner scan = new Scanner(System.in);

        J = scan.nextInt();
        P = scan.nextInt();
        V = scan.nextInt();
        E = scan.nextInt();
        D = scan.nextInt();

        if(J == -1)
        {
            if(P != -1 && V != -1 && E != -1 && D != -1)
            {
                 J = V + E + D;
            }
            else if(V == -1)
            {
                V = (P - E)/3;
                J = V + E + D;
            }
            else if(E == -1)
            {
                E = P - 3*V;
                J = V + E + D;
            }
            else if(D == -1)
            {

            }
            else if(P == -1)
            {
                P = 3*V + E;
                J = V + E + D;
            }
        }
        else if(P == -1)
        {
            if(V != -1 && E != -1 && D != -1)
            {
                P = 3*V + E;
            }
            else if(V == -1)
            {
                V = J - E - D;
                P = 3*V + E;
            }
            else if(E == -1)
            {
                E = J - V - D;
                P = 3*V + E;
            }
            else if(D == -1)
            {
                D = J - V - E;
                P = 3*V + E;
            }
        }
        else if(V == -1)
        {
            if(E != -1 && D != -1)
            {
                V = J - D - E;
            }
            else if(E == -1)
            {
                V = (P+D-J)/2;
                E = J - D - V;
            }
            else if(D == -1)
            {
                V = (P - E)/3;
                D = J - V - E;
            }
        }
        else if(D == -1)
        {
            if(E == -1)
            {
                E = P - 3*V;
                D = J - V - E;
            }
            else
            {
                D = J - E - V;
            }
        }
        else if(E == -1)
        {
            E = P - 3*V;
        }
        System.out.print(J);
        System.out.print(" "+P);
        System.out.print(" "+V);
        System.out.print(" "+E);
        System.out.println(" "+D);
    }
}