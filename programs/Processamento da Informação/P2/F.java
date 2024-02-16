import java.util.Scanner;

public class Nomicula3 {

    static String nomiculate(String n, String m, int d) {
        int ni = 0;
        int mi = 0;
        String nomicula = "";
        while (nomicula.length() < (n.length()+m.length())) {
            for (int i = 0; i < d; i++) {
                if (ni < n.length()) {
                    nomicula += n.charAt(ni);
                    ni++;
                }
                else {
                    break;
                }
            }
            for (int i = 0; i < d; i++) {
                if (mi < m.length()) {
                    nomicula += m.charAt(mi);
                    mi++;
                }
                else {
                    break;
                }
            }
        }
        return nomicula;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String n = scan.next();
            String m = scan.next();
            int d = scan.nextInt();
            System.out.println(nomiculate(n, m, d));
        }
    }    
}