import java.util.Scanner;

public class Participacao {

    static void insertionSort(String v[], int n) {
        for (int i = 1; i < n; i++) {
            String key = v[i];
            int j = i - 1;

            while (j >= 0 && (v[j]).compareTo(key) > 0) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = key;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int d = 0;
        String names[] = new String[n];

        for (int i = 0; i < n; i++) {
            if (("+").compareTo(scan.next()) == 0) {
                a++;
            }
            else {
                d++;
            }
            names[i] = scan.next();
        }
        insertionSort(names, n);
        System.out.printf("atentos: %d distraidos: %d\n", a, d);
    }
}