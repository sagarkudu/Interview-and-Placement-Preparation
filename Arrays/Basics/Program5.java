//Q.2 Write a program to sort given array.

package Arrays.Basics;

import java.util.Scanner;

public class Program5 {
    
    public static void main(String[] args) {
        
        int size, temp;
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        System.out.println("Enter " +size +" elements in the array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nOriginal elements are: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        //sort the array in ascending order
        for(int i=0; i<size; i++){
            for(int j= i+1; j<size; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //display elements after sorting
        System.out.print("\nElements of array in ascending order: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        sc.close();
    }
}
