import java.util.Scanner;

public class Carteirinha {
    
    static int timeListenedToComplete(int M[], int K[], int m, int k) {
        boolean C[] = new boolean[m]; // tracks listened
        int tl = 0; // time listened
        boolean all_listened = false;

        for (int i = 0; i < k; i++) {
            C[K[i]-1] = true; // set current track as listened
            if (all_listened == false) { // track listened (time tl added)
                tl += M[K[i]-1];
            }
            else { // all tracks already listened, breaking loop
                break;
            }

            if (i < k) { // check if all tracks were listened
                for(int j = 0; j < m; j++) {                    
                    if (C[j] == false) {
                        break;
                    }
                    if (j == m-1) {
                        all_listened = true;
                    }                    
                }                                
            }  
        }

        if (all_listened) {
            return tl;
        }
        else {
            return -1;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            int m = scan.nextInt();
            int k = scan.nextInt();
            int M[] = new int[m];
            int K[] = new int[k];
    
            for (int i = 0; i < m; i++) {
                M[i] = scan.nextInt();
            }
            for (int i = 0; i < k; i++) {
                K[i] = scan.nextInt();
            }
            System.out.println(timeListenedToComplete(M, K, m, k));
        }        
    }
}