//exo4
import java.util.Scanner; 


/* General notes :
- don't over use the comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should && vars without meaning
 * 1.5 pt -> space optimization //The reason for why u won't get full point (2.5pt): for the noted useless operation
 * 2.5 pt -> speed optimization
 * TOTAL : 1+0.5+1.5+2.5 = 5.5 */

public class exo4 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter the size of the array:"); 
        int N = scanner.nextInt();  
 
        int[] myarray = new int[N]; 
 
        System.out.println("Enter " + N + " elements:"); 
        for (int i = 0; i < N; i++) { // better solution instead of using N use myarray.length
            myarray[i] = scanner.nextInt();  // user needs to know what is the chars that he is inputting
        } 
 
        System.out.println("Press 1 to find max value, 2 to find min value, 3 to sort A to Z, 4 to sort Z to A, 5 to add an element, 6 to delete an element:");
        int T = scanner.nextInt();  
 
        switch (T) { 
            case 1: 
                // Find max value 
                int imax = 0; 
                for (int i = 1; i < N; i++) { 
                    if (myarray[i] > myarray[imax]) { 
                        imax = i;  
                    } 
                } 
                System.out.println("Max value: " + myarray[imax]); // Note : well its possible to work with array elements instead of the indexes so u don't have to access the array again in this step but since accessing element in the array is O(1) operation so it's ok but things will be different in case of lists
                break;
 
            case 2: 
                // Find min value 
                int imin = 0; 
                for (int i = 1; i < N; i++) { 
                    if (myarray[i] < myarray[imin]) { 
                        imin = i;  
                    } 
                } 
                System.out.println("Min value: " + myarray[imin]); // same note
                break; 
 
            case 3: 
                // Sort A to Z (ascending order) 
                for (int i = 0; i < N - 1; i++) {
                    for (int j = i + 1; j < N; j++) { 
                        if (myarray[i] > myarray[j]) { 
                            int temp = myarray[i]; 
                            myarray[i] = myarray[j]; 
                            myarray[j] = temp; 
                        } 
                    } 
                } 
                System.out.println("Table sorted A to Z:"); 
                for (int i = 0; i < N; i++) { 
                    System.out.print(myarray[i] + " "); 
                } 
                System.out.println(); // nice
                break; 
 
            case 4: 
                // Sort Z to A (descending order) 
                for (int i = 0; i < N - 1; i++) { 
                    for (int j = i + 1; j < N; j++) { 
                        if (myarray[i] < myarray[j]) { 
                            int temp = myarray[i]; 
                            myarray[i] = myarray[j]; 
                            myarray[j] = temp; 
                        } 
                    } 
                } 
                System.out.println("Table sorted Z to A:"); 
                for (int i = 0; i < N; i++) { 
                    System.out.print(myarray[i] + " "); 
                } 
                System.out.println(); 
                break; 
 
            case 5: 
                // Add element to the array (create a new larger array) 
                System.out.println("Enter an element to add:"); 
                int elementToAdd = scanner.nextInt(); 
                 
                int[] newArray = new int[N + 1]; 
                 
                for (int i = 0; i < N; i++) { 
                    newArray[i] = myarray[i]; 
                } 
                 
                newArray[N] = elementToAdd; 
                myarray = newArray; 
                N++;// useless operation
                 
                System.out.println("New table:"); 
                for (int i = 0; i < N; i++) { 
                    System.out.print(myarray[i] + " "); 
                } 
                System.out.println(); 
                break; 
 
            case 6: 
                // Delete element from the array (create a new smaller array) 
                System.out.println("Enter the element to delete:"); 
                int elementToDelete = scanner.nextInt(); 
                 
                boolean found = false; 
                int[] newArrayDelete = new int[N - 1]; 
                int index = 0; 
                 
                for (int i = 0; i < N; i++) { 
                    if (myarray[i] == elementToDelete) {
                        found = true;  
                        continue;  
                    } 
                    newArrayDelete[index++] = myarray[i]; 
                } 
                 
                if (found) { 
                    myarray = newArrayDelete; 
                    N--;  // useless operation
                    System.out.println(" new table:"); 
                    for (int i = 0; i < N; i++) { 
                        System.out.print(myarray[i] + " "); 
                    } 
                    System.out.println(); 
                } else { 
                    System.out.println("Element not found in the table."); 
                } 
                break; 
 
            default: 
                System.out.println("Invalid choice"); 
        } 
 
        scanner.close(); 
    } 
}

