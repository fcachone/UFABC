import java.util.Scanner;

public class Pangrama {

	public static void main(String[] args) {
    	Scanner reader = new Scanner(System.in);
    	while ( reader.hasNextLine()){
    		String frase = reader.nextLine();

            String fraseSemEspaco = frase.replaceAll(" ","").toLowerCase();
    		validarPangrama(fraseSemEspaco);
    	}
    	reader.close();

	}

	public static void validarPangrama(String frase) {
		String letras = "abcdefghijklmnopqrstuvwxyz";
		int tamLetras = letras.length();

		 for (int i = 0; i < tamLetras; i++) {
			 Character letra = letras.charAt(i);
			 boolean temLetra = false;
			 for (int j = 0; j < frase.length(); j++) {
				 Character letraFrase = frase.charAt(j);

				 if (letra == letraFrase) {
					 temLetra = true;
					 break;
				 }
			 }
			 if (!temLetra) {
				 System.out.println("nao");
				 break;
			 } else if (temLetra &&  i==(tamLetras-1)) {
				 System.out.println("sim");
				 break;
			 }

		 }


	}

}