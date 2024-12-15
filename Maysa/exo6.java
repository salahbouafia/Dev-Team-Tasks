// exo 6     
import java.util.Scanner;


/* General notes :
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should && vars without meaning
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL : 1+0.5+1.5+2.5 = 6.5 */

public class exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // Ask user for the message  
        System.out.println("Enter a message:");
        String message = scanner.nextLine();        
        // Ask user for the integer to shift each character      
        System.out.println("Enter an integer to shift each character:");
        int shift = scanner.nextInt();        
        // Initialize an empty string to hold the encrypted message      
        String encryptedMessage = "";
                
        for (int i = 0; i < message.length(); i++) {            
            char c = message.charAt(i);                       // Shift the character by the given integer
            char shiftedChar = (char) (c + shift);            // Concatenate the shifted character to the encrypted message
            encryptedMessage += shiftedChar;
        }
        // display the encrypted message
        System.out.println("Encrypted message: " + encryptedMessage);
    }
}
