// exo 6     
import java.util.Scanner;

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
