import java.util.Scanner;

public class DoisMilQuarentaOito {
	
	static int colunalinha = 4;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[][] numeros = new int[4][4];
		boolean possivelJogar = false;
		
		for(int i = 0; i<colunalinha; i++) {
			for(int j = 0; j<colunalinha; j++) {
				numeros[i][j] = leitor.nextInt();
			}
		}
		
		//Verifica se tem algum 0
		
		for(int i = 0; i<colunalinha; i++) {
			for(int j = 0; j<colunalinha; j++) {
				if(numeros[i][j] == 0) {
					possivelJogar = true;
				}
			}
		}
		
		//verifica numeros iguais adjacentes
		for(int i = 0; i<colunalinha; i++) {
			for(int j = 0; j<colunalinha; j++) {
				//cima
				if(i != 0) 
				{
					if(numeros[i][j] == numeros[i-1][j]) 
					{
						possivelJogar = true;
					}
				}
				//baixo
				if(i != 3) {
					if(numeros[i][j] == numeros[i+1][j]) {
						possivelJogar = true;
					}
				}
				//esquerda
				if(j != 0) {
					if(numeros[i][j] == numeros[i][j-1]) {
						possivelJogar = true;
					}
				}

				//direita
				if(j!= 3) {
					if(numeros[i][j] == numeros[i][j+1]) {
						possivelJogar = true;
					}
				}
			}
		}
		
		if(possivelJogar) {
			System.out.println("Keep playing!");
		}else {
			System.out.println("Game over!");
		}
		

	}

}
