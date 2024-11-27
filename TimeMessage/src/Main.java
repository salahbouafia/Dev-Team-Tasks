
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
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