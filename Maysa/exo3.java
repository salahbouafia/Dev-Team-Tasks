// exo3 
import java.util.Scanner; 
 
public class exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int N = scanner.nextInt();

        int[][] matrix = new int[N][N];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int[][] resultMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    resultMatrix[i][j] += matrix[i][k] * matrix[k][j];
                }
            }
        }

            //  matrix (M * M)
        System.out.println("The result of matrix multiplication (M * M) is:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(resultMatrix[i][j] + " ");
                }
            System.out.println();
        }
            scanner.close();
    }
}