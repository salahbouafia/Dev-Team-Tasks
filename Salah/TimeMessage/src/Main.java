
import java.time.LocalTime;

/* General notes :
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
*/

/** Evaluation :
 * 1pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL :  6.5 */
public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        // use methods (functions)
        // use ">=" OR/AND "<=" to avoid confusion
        if (time.getHour()>2 && time.getHour()<12){
            System.out.println("Good Morning");
        }else if (time.getHour()>11 && time.getHour()<16){
            System.out.println("Good Afternoon");
        }else if (time.getHour()>15 && time.getHour()<21){
            System.out.println("Good Evening");
        }else if (time.getHour()>21 || time.getHour()<3){
            System.out.println("Good Night");
        }
    }
}