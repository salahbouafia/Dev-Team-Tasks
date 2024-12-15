//package ex6;

import java.util.Scanner;

/* General notes :
- there is no comments ( the comments are made to explain what's done and not how it is done )
- Class name always start with Upper case
*/

/** Evaluation :
 * 1 pt -> for the solution
 * 0.5 pt -> for the clean code principles  //The reason for why u won't get full point (1pt): you could use function to do that job and called from the main
 * 2.5 pt -> space optimization
 * 2 pt -> speed optimization //The reason for why u won't get full point (2.5pt): for printing the result char by char
 * TOTAL : 0.5+0.5+2.5+2 = 6 */

public class crypting_message {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un message : ");
            String message = scanner.nextLine();
            System.out.print("Entrez un nombre pour decaler les caracteres : ");
            int deca = scanner.nextInt();
            System.out.println("Message crypte : " );
            for (int i = 0; i < message.length(); i++) {
                char N = message.charAt(i);
                N += deca  ;
                System.out.print(N);// the encrypted text should be in one String

            }

        }


    }

