import java.util.*;

public class Prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int maxStudents = 0;
            int maxTime = 0;
            int N = sc.nextInt();
            int[] nums = new int[N];

            maxStudents = N/2;

            for(int i = 0; i < N; i++) nums[i] = sc.nextInt();

            Arrays.sort(nums);

            maxTime = nums[(nums.length/2)] - nums[(nums.length/2)-1];

            System.out.println("" + maxStudents + " " + maxTime);
        }
    }
}

// javac Prova.java
// java Prova