package ex6;

import java.util.Scanner;

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
                System.out.print(N);

            }

        }


    }

