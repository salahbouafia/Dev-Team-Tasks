package ExoThree;
import java.util.Scanner;

     public class matrice {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("veuillez entrez la taille de la matrice (N x N): ");
            int N = sc.nextInt();
            int[][] matrice = new int[N][N];
            System.out.println("Entrez les valeurs de la matrice : ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrice[i][j] = sc.nextInt();
                }
            }

            int[][] resultat = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        resultat[i][j] += matrice[i][k] * matrice[k][j];
                    }
                }
            }
            System.out.println("la matrice au carre est  : ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(resultat[i][j] + " ");
                }
            }
        }
    }

