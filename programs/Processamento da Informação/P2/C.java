import java.util.Scanner;

public class Aluvid21 {

    static int lesserPosNum(int v[], int n) {
        int l = 1000;
        int li = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] >= 0 && v[i] < l) {
                l = v[i];
                li = i;
            }
        }
        v[li] = -1; // invalidate num
        return l;
    }

    static int greaterPosNum(int v[], int n) {
        int g = 0;
        int gi = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] >= 0 && v[i] > g) {
                g = v[i];
                gi = i;                
            }
        }
        v[gi] = -1; // invalidate num
        return g;
    }

    static int maxAluvidLetality(int v[], int n) {
        int max_let = 0;
        if (n <= 1) {
            return 0;
        }
        else if (n%2 == 0){
            for (int i = 0; i < n/2; i++) {
                max_let += (greaterPosNum(v, n)-lesserPosNum(v, n));
            }
        }
        else {
            for (int i = 0; i < (n-1)/2; i++) {
                max_let += (greaterPosNum(v, n)-lesserPosNum(v, n));
            }
        }
        return max_let;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = scan.nextInt();
            }
            System.out.println(maxAluvidLetality(v, n));
        }
    }
}