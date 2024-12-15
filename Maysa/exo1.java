//exo1      
import java.util.Scanner;

/* General notes :
- don't over use the comments ( the comments are made to explain what's done and not how it is done )
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 1 pt   -> for the clean code principles
 * 1.5 pt -> for creativity and using scanner.close() method
 * 2.5 pt -> space optimization
 * 1.5 pt -> speed optimization //The reason for why u won't get full point (2.5pt): you could get faster result if u didn't use trim()
 * TOTAL : 1+1+1.5+2.5+1.5 = 7.5 */



public class exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user for their username
        System.out.println("Enter a username:");   /**why println() ? normal print will be enough**/
        // Get the username
        String username = scanner.nextLine().trim(); /**Trim() is a good thing to use but in some cases**/
        // Print message
        System.out.println("Hello, " + username);        
        scanner.close(); /**GOOD**/
    }
}
