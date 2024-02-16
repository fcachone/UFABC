import java.util.*;
import java.text.SimpleDateFormat;

public class BackToTheFuture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c = new GregorianCalendar();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

        ArrayList<String> goStop = new ArrayList<String>();

        while(sc.hasNext()) {
            int DA = sc.nextInt();
            int MA = sc.nextInt();
            int AA = sc.nextInt();
            int DD = sc.nextInt();
            int MD = sc.nextInt();
            int AD  = sc.nextInt();
            int N = sc.nextInt();
            String commands = sc.next();

            c.set(AA, MA-1, DA);

            for(int j = 0; j < commands.length(); j++) {
                if(commands.charAt(j) == '+') c.add(Calendar.DATE, 1);
                if(commands.charAt(j) == '-') c.add(Calendar.DATE, -1);
            }

            String dateNow = String.valueOf(form.format(c.getTime()));
            String year = dateNow.substring(0, 4);
            String month = dateNow.substring(5, 7);
            if(month.charAt(0) == '0') month = month.replace("0", "");
            String day = dateNow.substring(8);
            if(day.charAt(0) == '0') day = day.replace("0", "");
            String dateNowCorrected = year + "-" + month + "-" + day;

            String dateWanted = "" + AD + "-" + MD + "-" + DD;

            if(dateNowCorrected.equals(dateWanted)) goStop.add("GO...GO...GO");
            else goStop.add("STOP...STOP...STOP");
        }

        for(int i = 0; i < goStop.size(); i++) System.out.println(goStop.get(i));
    }
}

// javac BackToTheFuture2.java
// java BackToTheFuture2