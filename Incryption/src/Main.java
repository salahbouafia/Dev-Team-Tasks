
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What Is Your Message: ");
        char[] msg = input.nextLine().toCharArray();

        System.out.print("What Is The Increment: ");
        int increment = input.nextInt();

        System.out.print("The Encrypted Message Is: ");
        for(char c : msg){
            c += (char) increment;
            System.out.print(c);
        }
        /*System.out.print("\nThe Decrypted Message Is: ");
        for(char c : msg) {
            c -= (char) increment;
            System.out.print(c);
        }*/
    }
}