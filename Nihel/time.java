package ExFive;
import java.time.*;

public class time {
    public static void main(String[] args) {
        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        System.out.println(hour + ":" + minute);
        if (hour >= 3 && hour < 12) {
            System.out.println(" good morning! its " +hour + ":" + minute);
        } else if (hour >= 12 && hour < 16) {
            System.out.println(" good afternoon!  its " +hour + ":" + minute );
        } else if (hour >= 16 && hour < 21) {
            System.out.println(" good evening!  its " +hour + ":" + minute);
        } else  {
            System.out.println(" good night!  its " +hour + ":" + minute );
        }


    }
}
