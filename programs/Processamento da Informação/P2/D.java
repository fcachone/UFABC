import java.util.Scanner;

public class Nomicula {

    static String nomiculate(String n, String m) {
        int ni = 0;
        int mi = 0;
        String nomicula = "";
        while (nomicula.length() < (n.length()+m.length())) {
            if (ni < n.length()) {
                nomicula += n.charAt(ni);
                ni++;
            }
            if (mi < m.length()) {
                nomicula += m.charAt(mi);
                mi++;
            }
        }
        return nomicula;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String n = scan.next();
            String m = scan.next();
            System.out.println(nomiculate(n, m));
        }
    }    
}