//Q.8 Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.

package Arrays.Basics;
import java.util.*;

public class Program8 {
    
    public static void main(String[] args) {

        int size;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        System.out.println("Enter "+size +" elements in the array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nBefore sorting:");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] +" ");
        }

        //sorting elements in ascending order
        for(int i=0; i<size; i++){
            for(int j= i+1; j<size; j++) {
                if(arr[i] > arr[j]) {
               int  temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nAfter Sorting: ");
        int count=0;
        for(int i=0; i<size; i++) {
            if(arr[i]==0 || arr[i]==1 || arr[i]==2) {
                count++;
            }
            System.out.println(arr[i] +" ");
        }

        sc.close();
        
    }
    
}
