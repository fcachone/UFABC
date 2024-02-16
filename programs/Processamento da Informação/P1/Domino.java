import java.util.Scanner;
public class Domino
  {
    public static void main (String args[])
    {
      int N, A, cont = 0;

      Scanner entrada = new Scanner (System.in);

      N = entrada.nextInt();

      A = N + 1;

      entrada.close();

      while (A != 0)
        {
          cont = A + cont;

          A -= 1;
        }
      System.out.println(cont);
    }
  }