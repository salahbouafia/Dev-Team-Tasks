//exo5 
import java.util.Scanner; 
 
public class exo5 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter current hour:"); 
        int h = scanner.nextInt(); 
         
        System.out.println("AM or PM?"); 
        String indice = scanner.next();  
         
         
        if (h >= 3 && h < 12 && indice.equals("am")) { 
            System.out.println("GOOD MORNING"); 
        } else if (h >= 12 && h < 4 && indice.equals("pm")) { 
            System.out.println("GOOD AFTERNOON"); 
        } else if (h >= 4 && h < 9 && indice.equals("pm")) { 
            System.out.println("GOOD EVENING"); 
        } else { 
            System.out.println("GOOD NIGHT"); 
        } 
 
         
        scanner.close(); 
    } 
}