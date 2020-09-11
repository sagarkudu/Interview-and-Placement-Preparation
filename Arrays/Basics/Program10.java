//Q.10) Move all the negative elements to one side of the array.

package Arrays.Basics;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        
        int size;
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:");
        size = sc.nextInt();

        System.out.println("enter "+size +" elements in the array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nOriginal elements:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        //sorting the elements
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }

        //After sorting, arranging all elements from negative side too
        System.out.print("\nElements from negative sides: " );
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        sc.close();
    
    }
    
   
}
