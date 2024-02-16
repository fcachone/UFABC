import java.util.*;

public class Cade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NlastWeek = sc.nextInt();
        int NlastHours = sc.nextInt();
        int[] roomsToVisit = new int[NlastWeek];
        ArrayList<Integer> roomsLastHours = new ArrayList<Integer>();

        for(int i = 0; i < NlastHours; i++) roomsLastHours.add(sc.nextInt());

        for(int i = 0; i < NlastWeek; i++) {
            int room = sc.nextInt();

            if(roomsLastHours.contains(room)) roomsToVisit[i] = 0;

            else {
                roomsToVisit[i] = 1;
                roomsLastHours.add(room);
            }
        }

        for(int i = 0; i < NlastWeek; i++) System.out.println(roomsToVisit[i]);
    }
}

// javac Cade.java
// java Cade