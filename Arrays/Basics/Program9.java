//Q.9)Find the range of the array. 
//Range means the difference between the maximum and minimum element in the array.

package Arrays.Basics;

import java.util.Scanner;

public class Program9 {
    
    public static void main(String[] args) {
        
        int size;
        int[] arr = new int[10];
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        System.out.println("Enter "+size +" elements in the array");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nElements in the array are: ");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nRange of a array is:");
        for(int i=0; i<size; i++) {
            if(arr[i] > max) //if current element is greater than max
                max = arr[i];
            else if(arr[i] > min)
                min = arr[i];
        }

        int range = (max - min);
        System.out.println("\nRange of " +max +" and " +min +" is" +" =" +range);
    }
}
