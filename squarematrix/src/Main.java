
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Size Of Your Matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        int[][] smatrix = new int[size][size];

        System.out.println("Enter The Elements Of Your Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("N[" + i + "][" + j + "]= ");
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                smatrix[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    smatrix[i][j] += matrix[i][k] * matrix[k][j];
                }
            }
        }
        System.out.println("The Matrix Squared is: ");
        for (int i = 0; i < size; i++) {
            System.out.print("[ ");
            for (int j = 0; j < size; j++) {
                System.out.print(smatrix[i][j]+" ");
            }
            System.out.println("]");
        }
    }
}