package ExTwo;
import java.util.Scanner;

   public class Operations {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Donnez la valeur de a : ");
           double a = sc.nextDouble();
           System.out.println("Donnez la valeur de b : ");
           double b = sc.nextDouble();
           System.out.println("Veuillez sélectionner l'opération à réaliser (+, -, *, /,...): ");
           char operation = sc.next().charAt(0);
           switch (operation) {
               case '+':
                   System.out.println("le resultat de l'operation est:  "+ (a + b));
                   break;
               case '-':
                   System.out.println("le resultat de l'operation est: "+ (a - b));
                   break;
               case '*':
                   System.out.println("le resultat de l'operation est "+ (a * b));
                   break;
               case '/':
                   if( b != 0 )
                       System.out.println("le resultat de l'operation est "+ (a / b));
                   else System.out.println("la division par 0 est impossible !!!");
                   break;
               case '^':
                   System.out.println("le resultat de l'operation est "+ (Math.pow(a, b)));
                   break;
               default:System.out.println(" Cette opération n'est pas disponible pour le moment ");
           }
       }
   }