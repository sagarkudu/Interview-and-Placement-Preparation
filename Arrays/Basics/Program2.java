//Q2. to check number is present in the array or not.

package Arrays.Basics;
import java.util.*;

public class Program2 {
    
    public static void main(String[] args) {
        
        int size, number;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the size of the array");
        size = sc.nextInt();

        //Creating array to store the all the numbers
        int[] arr = new int[size];

        System.out.println("\n\nEnter the number you wish to find:");
        number = sc.nextInt();

        //taking input of array with user's specified size
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //next task to find number is available in array or not
        for(int i=0; i<size; i++){
            if(arr[i]!=number)
                count=0;
        }

        if(count==1){
            System.out.println("True");
        }
        else
            System.out.println("False");

        sc.close();
    }
}
