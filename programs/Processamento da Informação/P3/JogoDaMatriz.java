import java.util.*;

public class JogoDaMatriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char U = 'U';
        char A = 'A';
        char comando = 'C';
        int x=0, y=0, z=0, w=0, v=0, i=0, j=0, k=0;

        int M[][] = new int[500][500];
        int n = teclado.nextInt();


        for(k=0; k<n; k++){
            comando = teclado.next().charAt(0);
            if (comando == U){
                x = teclado.nextInt();
                y = teclado.nextInt();
                z = teclado.nextInt();
                w = teclado.nextInt();
                v = teclado.nextInt();
                for(i=(x-1); i<=(z-1); i++)
                    for(j=(y-1); j<=(w-1); j++)
                        M[i][j] += v;
            }

            if (comando == A){
                x = teclado.nextInt();
                y = teclado.nextInt();
                System.out.println(M[x-1][y-1]);
            }
        }

    }

}