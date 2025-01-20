---
title: Test Pass Array
categories: [ 'sample-code', 'java', 'arrays' ]
---

Working with passing Arrays

````java

/*   
 * Name: TestPassArray
 * CSU ID: 
 * CIS 265: Review
 * Description: Working witg passing arrays
 *
*/
import java.util.Scanner;

public class TestPassArray {
    /**
     * Main entrty point for the program
     */
    public static void main(String[] args){
        int[] items = { 1, 2 };
        
        System.out.println("Before Swap:");        
        System.out.println("Items: " + items[0] + ", " + items[1] );        
        System.out.println();        

        // Swap - but this won't change the array        
        swap(items[1], items[1]);
        System.out.println("After Swap:");        
        System.out.println("Items: " + items[0] + ", " + items[1] );       
        System.out.println();        
        
        // Swap - and change the array
        swap(items);
        System.out.println("After Swap (passing array):");        
        System.out.println("Items: " + items[0] + ", " + items[1] );       
        System.out.println();        

        System.out.println(":: end-of-program ::");        
    }    
    /**
     * Gets a suit from the index
     */
    public static void swap( int n1, int n2) {
        // This will only modify the numbers locally
        int number = n1;
        n1 = n2;
        n2 = number;
    }

    /**
     * Gets the rank for the index
     */
    public static void swap(int[] items){
        int number = items[0];
        
        // Swap the items
        items[0] = items[1];
        items[1] = number;
    }    
}


````
