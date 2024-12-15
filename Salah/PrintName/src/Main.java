
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Hello " + name); // what if u used : System.out.print("Hello " + input.nextLine());
    }
}