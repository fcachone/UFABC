import java.util.Scanner;

public class Minecraft {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int m = leitor.nextInt();
		String[] numerosLinhas = new String[n];
		String[][] numeros = new String[n][m];
		
		for(int i = 0; i<n; i++) {
			numerosLinhas[i] = leitor.next();
			/*for(int j = 0; j<m; j++) {
				numeros[i][j] = leitor.next();
				System.out.println(numeros[i][j]);

			}*/
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				numeros[i][j] = String.valueOf(numerosLinhas[i].charAt(j));
			}
		}
	 
		int numeroCostas = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				boolean costa = false;
				//cima
				if(i != 0) 
				{
					if(numeros[i][j].contains("#") && numeros[i-1][j].contains(".")) 
					{
						costa = true;
					}
				}else {
					if(numeros[i][j].contains("#")) {
						costa = true;
					}
				}
				//baixo
				if(i != n-1) {
					if(numeros[i][j].contains("#") && numeros[i+1][j].contains(".")) {
						costa = true;
					}
				}else {
					if(numeros[i][j].contains("#")) {
						costa = true;
					}
				}
				//esquerda
				if(j != 0) {
					if(numeros[i][j].contains("#") && numeros[i][j-1].contains(".")) {
						costa = true;
					}
				}else {
					if(numeros[i][j].contains("#")) {
						costa = true;
					}
				}

				//direita
				if(j!= m-1) {
					if(numeros[i][j].contains("#") && numeros[i][j+1].contains(".") ) {
						costa = true;
					}
				}else {
					if(numeros[i][j].contains("#")) {
						costa = true;
					}
				}
				
				if(costa) {
					numeroCostas++;
				}
			}
			
		}
		System.out.println(numeroCostas);

	}

}
