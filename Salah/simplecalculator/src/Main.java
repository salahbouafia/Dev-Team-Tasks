import java.lang.Math;
import java.util.Scanner;


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
                double div = (float) num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + div);
                break;
            case "^" :
                int pow = (int) Math.pow(num1,num2);
                System.out.println(num1 + " ^ " + num2 + " = " + pow);
                break;
        }

    }
}