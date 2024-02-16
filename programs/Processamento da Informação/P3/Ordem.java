import java.util.Arrays;
import java.util.Scanner;

public class Ordem {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int[][] matriculasNotas = new int[n][2];
		
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<2; j++) {
				matriculasNotas[i][j] = leitor.nextInt();
			}
		}
		
		Arrays.sort(matriculasNotas, (a, b) -> Integer.compare(a[0], b[0]));
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<2; j++) {
				if(j == 0) {
					System.out.print(matriculasNotas[i][j] + " ");
				}else {
					System.out.println(matriculasNotas[i][j]);
				}
			}
		}
	}
}
