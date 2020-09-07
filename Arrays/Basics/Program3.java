//Q3. Find the minimum and maximum element in an array.

package Arrays.Basics;
import java.util.Scanner;

public class Program3 {
    
    public static void main(String[] args) {
        
        int size;
        int[] arr = new int[10];
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();  //taking size of array

        System.out.println("Enter " +size +" elements in the array");

        //input array elements
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        //now finding minimum and maximum in array.
        for(int i=0; i<size; i++) {
            if(arr[i] > max) //if current element is greater than max
                max = arr[i];
    
            else if(arr[i] > min)
                min = arr[i];
        }

        //Print maximum and minimum element
        System.out.println("Minimum is: " +min);
        System.out.println("Maximum is: " +max);

        sc.close();

    }
}
