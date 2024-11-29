 //exo2                                                                                                                          import java.util.Scanner; 
 import java.util.Scanner; 
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