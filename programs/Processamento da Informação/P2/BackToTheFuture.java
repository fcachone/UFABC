import java.util.*;
import java.text.SimpleDateFormat;

public class BackToTheFuture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c = new GregorianCalendar();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

        int N = sc.nextInt();
        String[] dates = new String[N];

        for(int i = 0; i < N; i++) {
            int D = sc.nextInt();
            int M = sc.nextInt();
            int A = sc.nextInt();
            int K = sc.nextInt();
            String commands = sc.next();

            c.set(A, M-1, D);

            for(int j = 0; j < commands.length(); j++) {
                if(commands.charAt(j) == '>') c.add(Calendar.DATE, 1);
                if(commands.charAt(j) == '<') c.add(Calendar.DATE, -1);
            }

            String date = String.valueOf(form.format(c.getTime()));

            String year = date.substring(0, 4);

            String month = date.substring(5, 7);
            if(month.charAt(0) == '0') month = month.replace("0", "");

            String day = date.substring(8);
            if(day.charAt(0) == '0') day = day.replace("0", "");

            dates[i] = day + "/" + month + "/" + year;
        }

        for(int i = 0; i < N; i++) System.out.println(dates[i]);
    }
}

// javac BackToTheFuture.java
// java BackToTheFuture