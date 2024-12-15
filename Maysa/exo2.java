 //exo2                                                                                                                          import java.util.Scanner; 
 import java.util.Scanner;

/* General notes :
- don't over use the comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
- try to make the switch case more readable as the example in the end of file
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
* 1 pt   -> for the solution
* 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
* 2.5 pt -> space optimization
* 2.5 pt -> speed optimization
* TOTAL : 1+0.5+2.5+2.5 = 6.5 */


    public class exo2 {
        public static void main(String[] args) { 
            Scanner scanner = new Scanner(System.in); 
     
            System.out.println("Enter number 1:"); 
            double a = scanner.nextDouble(); 
     
            System.out.println("Enter number 2:"); 
            double b = scanner.nextDouble(); 
     
            System.out.println("Enter the arithmetic operation (+, -, *, /, ^):"); 
            String operation = scanner.next(); 
     
            double result = 0; 
     
            // Using switch statement to perform the operation 
            switch (operation) { 
                case "+": 
                    result = a + b; 
                    break; 
     
                case "-": 
                    result = a - b; 
                    break; 
     
                case "*": 
                    result = a * b; 
                    break; 
     
                case "/": 
                    if (b != 0) {   
                        result = a / b; 
                    } else { 
                        System.out.println("Error: Division by zero."); 
                        return;  
                    } 
                    break; 
     
                case "^": 
                    result = Math.pow(a, b);   
                    break; 
     
                default: 
                    System.out.println("Operation does not exist."); 
                    return;  
            } 
     
             
            System.out.println("The result is: " + result); 
     
             
            scanner.close(); 
        } 
    }


    // Example of readable switch case

 /*switch (operation) {
    case "+": result = a + b; break;
    case "-": result = a - b; break;
    case "*": result = a * b; break;
    case "^": result = Math.pow(a, b); break;
    case "/":
        if (b != 0)
            result = a / b;
        else{
            System.out.println("Error: Division by zero.");
            return;
        }
        break;

    default:
        System.out.println("Operation does not exist.");
        return;
} */