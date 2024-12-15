// exo3 
import java.util.Scanner; 

/* General notes :
- don't over use the comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL : 1+0.5+2.5+2.5 = 6.5 */

public class exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int N = scanner.nextInt();

        int[][] matrix = new int[N][N];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt(); // user should get print so at least he could know what is the position of the number he is inputting
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