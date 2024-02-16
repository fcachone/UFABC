import java.util.Scanner;

public class Bolinhas
{
    public static void main(String[] arg)
    {
        int B, G, GR, Di, resto;
        Scanner scan = new Scanner(System.in);

        B = scan.nextInt();
        G = scan.nextInt();

        if(2*B < G && G/2 != 0)
        {
           resto = ((G)%1);
           GR = (G) - resto;

           Di = (GR/2) - B;
           System.out.println("Faltam "+ Di +" bolinha(s)");
        }
        else if(2*B < G && G/2 == 0)
        {
            Di = (G/2) - B;
            System.out.println("Faltam "+ Di +" bolinha(s)");
        }
        else
        {
            System.out.println("Voce tem bolinhas o suficiente!");
        }
    }
}