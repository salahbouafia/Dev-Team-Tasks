import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice,size,max=0,min=1000,temp;

        System.out.println("What Is The Size Of The Table: ");
        size = input.nextInt();
        int[] arr = new int[100];
        System.out.println("What Are The Elements Of The Table: ");
        for(int i=0;i<size;i++){
            System.out.print("Table["+i+"]: ");
            arr[i]=input.nextInt();
        }

        do {
            System.out.print("\n\n1.Find Max Value \n2.Find Min Value \n3.Order Table \n4.Delete Element From Table \n5.Add Element To Table \n6.Exit Program \n\nYour Choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    for(int i=0;i<size;i++){
                        if(arr[i]>max){
                            max = arr[i];
                        }
                    }
                    System.out.println("The Biggest Element In The Table Is: " + max);
                    break;
                case 2:
                    for(int i=0;i<size;i++){
                        if(arr[i]<min){
                            min = arr[i];
                        }
                    }
                    System.out.println("The Smallest Element In The Table Is: " + min);
                    break;
                case 3:
                    System.out.print("The Table In Descending Order: ");
                    for(int i=1;i<=size;i++){
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
                    System.out.println("What Is The Index Of The Element You Want To Delete: ");
                    int index = input.nextInt();
                    if(!(0 <= index && index <= size-1)){
                        System.out.println("Out Of Range.");
                        break;
                    }
                    size--;
                    for(int i=0;i<size;i++){
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
                        if(i==index2){
                            arr[i]=element;
                        }else if(i>index2){
                            arr[i]=arr[i-1];
                        }
                        System.out.print(arr[i]+" ");
                    }
                    break;
            }
        }while(choice!=6);

    }
}