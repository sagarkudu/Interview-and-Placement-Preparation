package Arrays.Basics;
import java.util.*;

public class Program4 {
    
    public static void main(String[] args) {
        
        int size;
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt(); //taking input size of array

        System.out.println("Enter " +size +" elements in the array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nOriginal elements are: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nAfter Reversing: ");
        for(int i=size-1; i>=0;  i--){
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
