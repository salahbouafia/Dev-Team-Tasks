//exo1      
import java.util.Scanner;
public class exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user for their username
        System.out.println("Enter a username:");        
        // Get the username
        String username = scanner.nextLine().trim();
        // Print message
        System.out.println("Hello, " + username);        
        scanner.close();
    }
}
