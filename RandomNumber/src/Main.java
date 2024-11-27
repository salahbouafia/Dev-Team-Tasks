
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[]arr ={6,0,0,7,18,18,1,5};
        int maxcount=0,mincount=100,mostrepeatednum=0,leastrepeatednum=0,k=0,size=arr.length;

        int index = rand.nextInt(arr.length-1);
        System.out.println("Random Number From The Array: " + arr[index]);

        for (int i : arr) {
            int count = 0;
            for (int j:arr) {
                if (i == j) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                mostrepeatednum = i;
            }
            if (count < mincount){
                mincount = count;
                leastrepeatednum = i;
            }
        }

        System.out.println("The Number That Has The Highest Chance: " + mostrepeatednum);
        System.out.println("The Number That Has The Lowest Chance: " + leastrepeatednum);

        System.out.println("Reversing The Numbers Of The Highest Chance With The Numbers Of The Lowest Chance: ");

        for(int i=0;i<size;i++){
            if(arr[i] == mostrepeatednum) {
                arr[i] = leastrepeatednum;
            }else if(arr[i] == leastrepeatednum){
                arr[i] = mostrepeatednum;
            }
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nEvening The Odds: ");

        for (int i=0; i<size; i++){
            boolean isunique = true;
            for(int j=i+1;j<size;j++) {
                if (arr[i] == arr[j]) {
                    isunique = false;
                    break;
                }
            }
            if(isunique){
                arr[k++]=arr[i];
                System.out.print(arr[k-1]+" ");
            }
        }
    }
}