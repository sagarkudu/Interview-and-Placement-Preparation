//Q.7) Given an number n. Find the number of occurrences of n in the array.

package Arrays.Basics;
import java.util.*;

public class Program7 {
    
    public static void main(String[] args) {
        
        int size, num;
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        System.out.println("Enter " +size +" elements in the array");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you wish to find its occurances:");
        num = sc.nextInt();

        int count = 0;
        for(int i=0; i<size; i++){
            if(arr[i] == num)
                count++;
        }
        System.out.println("The number " +num +" is repeated for "+count +" times");

        sc.close();
    }
}
