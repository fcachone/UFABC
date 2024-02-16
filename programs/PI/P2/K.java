import java.util.Scanner;

public class NomeMatricula {
    
    static void denomiculate(String nomicula) {
        String n = "";
        String m = "";
        for (int i = 0; i < nomicula.length(); i++) {
            if ((int)(nomicula.charAt(i)) >= 48 && (int)(nomicula.charAt(i)) <= 57) {
                m += nomicula.charAt(i);
            }
            else {
                n += nomicula.charAt(i);
            }
        }
        System.out.printf("%s %s\n", n, m);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String n = scan.next();
            denomiculate(n);            
        }
    }    
}