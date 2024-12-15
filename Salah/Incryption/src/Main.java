
import java.util.Scanner;

/* General notes :
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
*/

/** Evaluation :
 * 1pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2 pt -> speed optimization //The reason for why u won't get full point (2.5pt): for converting string to array without reason
 * TOTAL :  6 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What Is Your Message: ");
        char[] msg = input.nextLine().toCharArray();

        System.out.print("What Is The Increment: ");
        int increment = input.nextInt();

        System.out.print("The Encrypted Message Is: ");
        for(char c : msg){
            c += (char) increment;
            System.out.print(c);
        }
    }
}