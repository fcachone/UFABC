import java.util.Arrays;
import java.util.Scanner;

public class NovaRua {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int m = leitor.nextInt();
		int[][] numeros = new int[n][m];
		int[] minimo = new int[n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				numeros[i][j] = leitor.nextInt();
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				minimo[i] += numeros[i][j];
			}
		}
		
		Arrays.sort(minimo);

		System.out.println(minimo[0]);

	}

}


