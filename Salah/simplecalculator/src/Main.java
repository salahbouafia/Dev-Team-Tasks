import java.lang.Math;
import java.util.Scanner;


/* General notes :
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
*/

/** Evaluation :
 * 0.75pt -> for the solution //The reason for why u won't get full point (1pt): for allowing user to divide by 0
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL :  6.25 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter The Mathematical Operation ( + | - | * | / | ^ ): ");
        String op = input.next();

        System.out.print("Enter The Second Number: ");
        int num2 = input.nextInt();

        switch (op){
            case "+" :
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
                break;
            case "-" :
                int diff = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + diff);
                break;
            case "*" :
                int multi = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multi);
                break;
            case "/" :
                double div = (float) num1 / num2; //what if the num2 == 0 ??
                System.out.println(num1 + " / " + num2 + " = " + div);
                break;
            case "^" :
                int pow = (int) Math.pow(num1,num2);
                System.out.println(num1 + " ^ " + num2 + " = " + pow);
                break;
        }

    }
}