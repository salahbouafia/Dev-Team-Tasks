package ExFive;
import java.time.*;



/* General notes :
 */

/** Evaluation :
 * 1 pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2 pt -> speed optimization  //The reason for why u won't get full point (2.5pt): time is printed twice
 * TOTAL :  6 */

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
