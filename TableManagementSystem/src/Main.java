
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice,size,max=0,min=1000;
        List<Integer> arr = new ArrayList<>();

        do {
            System.out.print("\n\n1.Create Table \n2.Find Max Value \n3.Find Min Value \n4.Order Table \n5.Delete Element From Table \n6.Add Element To Table \n7.Exit Program \n\nYour Choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("What Is The Size Of The Table: ");
                    size = input.nextInt();
                    System.out.println("What Are The Elements Of The Table: ");
                    for(int i=0;i<size;i++){
                        System.out.print("Table["+i+"]: ");
                        arr.add(input.nextInt());
                    }
                    break;
                case 2:
                    for(int i: arr){
                        if(i>max){
                            max = i;
                        }
                    }
                    System.out.println("The Biggest Element In The Table Is: " + max);
                    break;
                case 3:
                    for(int i: arr){
                        if(i<min){
                            min = i;
                        }
                    }
                    System.out.println("The Smallest Element In The Table Is: " + min);
                    break;
                case 4:
                    System.out.print("The Table In Ascending Order: ");
                    arr.sort(null);
                    System.out.print(arr);

                    System.out.print("\nThe Table In Descending Order: ");
                    arr.sort(Collections.reverseOrder());
                    System.out.print(arr);
                    break;
                case 5:
                    System.out.print(arr + "\nWhat Is The Index Of The Element You Want To Delete: ");
                    int index = input.nextInt();
                    arr.remove(index);
                    System.out.print(arr);
                    break;
                case 6:
                    System.out.print("What Element Would You Like To Add: ");
                    int element = input.nextInt();
                    System.out.println(arr + "\nWhere Would You Like To Add The Element: ");
                    int index2 = input.nextInt();
                    arr.add(index2,element);
                    System.out.print(arr);
                    break;
            }
        }while(choice!=7);
        System.out.println("Thank You For Using Our Services!");
    }
}