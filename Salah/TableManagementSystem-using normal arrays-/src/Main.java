import java.util.*;

/*
 * General notes :
 * -> try to use functions (don't write all ur code in the main function !!)
 * -> I liked the idea of do while loop
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
*/

/** Evaluation :
 * 0.5pt  -> for the solution              //The reason for why u won't get full point (1pt): errors & miss handling do-while loop
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 1.5 pt -> space optimization            //The reason for why u won't get full point (2.5pt): for declaring vars in the start of the solution & allocating 100 element array
 * 2.5 pt -> speed optimization
 * TOTAL :  5 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice,size,max=0,min=1000,temp; // max/min of the array should be init at the first element of array ( index == 0 )

        System.out.println("What Is The Size Of The Table: ");
        size = input.nextInt();  // what if the value is 0
        int[] arr = new int[100];// optimal solution :: int[] arr = new int[size]; :: at least the user could have user bigger table
        System.out.println("What Are The Elements Of The Table: ");
        for(int i=0;i<size;i++){
            System.out.print("Table["+i+"]: ");
            arr[i]=input.nextInt();
        }

        do {
            System.out.print("\n\n1.Find Max Value \n2.Find Min Value \n3.Order Table \n4.Delete Element From Table \n5.Add Element To Table \n6.Exit Program \n\nYour Choice: ");
            choice = input.nextInt();
            switch (choice){ // add the default case in switch to handle the incorrect inputs
                case 1:
                    for(int i=0;i<size;i++){
                        if(arr[i]>max){ // todo: test with array full of the negative values only and see the output
                            max = arr[i];
                        }
                    }
                    System.out.println("The Biggest Element In The Table Is: " + max);
                    break;
                case 2:
                    for(int i=0;i<size;i++){
                        if(arr[i]<min){ // todo: test with array full of values bigger than (>1000) and see the output
                            min = arr[i];
                        }
                    }
                    System.out.println("The Smallest Element In The Table Is: " + min);
                    break;
                case 3: //should be separated ie (Descending/Ascending)
                    System.out.print("The Table In Descending Order: ");
                    for(int i=1;i<=size;i++){ /// i = 1 ?? (correction i = 0)
                        for(int j=i+1;j<size;j++){
                            if(arr[j]>arr[i]){
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                        System.out.print(arr[i]+" ");
                    }

                    System.out.print("\nThe Table In Ascending Order: ");
                    for(int i=0;i<size;i++){
                        for(int j=i+1;j<size;j++){
                            if(arr[j]<arr[i]){
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 4:
                    System.out.println("What Is The Index Of The Element You Want To Delete: ");// usually the elements should be found by values not indexes to avoid having conflicts
                    int index = input.nextInt();
                    if(!(0 <= index && index <= size-1)){
                        System.out.println("Out Of Range.");
                        break;
                    }
                    size--;
                    for(int i=0;i<size;i++){ /// it's not removing elements it only prints all the elements of the array and skipping the selected index
                    // suggestion : create new array and copy the elements to it
                        if(i>=index){
                            arr[i]=arr[i+1];
                        }
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 5:
                    System.out.println("What Is The Element You Want To Add To The Table: ");
                    int element = input.nextInt();
                    System.out.println("Where Would You Like To Add The Element: ");
                    int index2 = input.nextInt();
                    if(!(0 <= index2 && index2 <= size)){
                        System.out.println("Out Of Range.");
                        break;
                    }
                    size++;
                    for(int i=size-1;i>=0;i--){
                        // suggestion : create new array and copy the elements to it
                        if(i==index2){
                            arr[i]=element;
                        }else if(i>index2){
                            arr[i]=arr[i-1];
                        }
                        System.out.print(arr[i]+" ");
                    }
                    break;
            }
        }while(choice!=6); // could be optimized more

    }
}