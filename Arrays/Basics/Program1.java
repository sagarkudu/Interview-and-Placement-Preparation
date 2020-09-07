// Q1. Create an Array of size 10 of integers. 
// Take input from the user for these 10 elements and print the entire array after that.

package Arrays.Basics;

import java.util.*;

public class Program1 {

    public static void main(String[] args) {

        int[] arr = new int[10]; //initializing array with size 10
        Scanner sc = new Scanner(System.in); //creating object of Scanner for input purpose

        System.out.println("\nEnter 10 integers of array");

        //taking input from the user
        for (int i=0;i<10;i++){
        arr[i] = sc.nextInt();
        }
        
        //printing array's output
        System.out.println("You have entered");
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}