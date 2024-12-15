//exo5 
import java.util.Scanner; 


/* General notes :
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 0.25pt -> for the solution //The reason for why u won't get full point (1pt): for not using the system lib and for the error in the conditions
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should && vars without meaning
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL : 1+0.5+1.5+2.5 = 5.75 */
public class exo5 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter current hour:"); 
        int h = scanner.nextInt(); 
         
        System.out.println("AM or PM?"); 
        String indice = scanner.next();  
         
         
        if (h >= 3 && h < 12 && indice.equals("am")) { 
            System.out.println("GOOD MORNING"); 
        } else if (h >= 12 && h < 4 && indice.equals("pm")) { //error
            System.out.println("GOOD AFTERNOON"); 
        } else if (h >= 4 && h < 9 && indice.equals("pm")) { 
            System.out.println("GOOD EVENING"); 
        } else { 
            System.out.println("GOOD NIGHT"); 
        } 
 
         
        scanner.close(); 
    } 
}