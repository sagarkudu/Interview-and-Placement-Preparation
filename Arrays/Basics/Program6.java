//Q.6 Find the Kth largest and Kth smallest number in an array.

package Arrays.Basics;
import java.util.Scanner;

public class Program6 {
  
    public static void main(String[] args) {
        
        int size, temp;
        int[]  arr = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        System.out.println("Enter " +size +" elements in the array");
        
        //taking input of array elements
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        //display array elements
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] +" ");
        }

        //sorting element in ascending order to get proper value for kth
        for(int i=0; i<size; i++){
            for(int j= i+1; j<size; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //our aim to find kth element
        System.out.println("\nEnter the size of the kth element:");
        int k = sc.nextInt();

        System.out.println("The " +k +"th lowest number is: "+arr[k-1]);
        System.out.println("The " +k +"th highest number is: "+arr[size-k]);

        sc.close();
    }
}
