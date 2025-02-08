---
title: Test Method OVerloading
categories: [ 'sample-code', 'java', 'oop' ]
date: 2025-01-20
---

Provides an implementation with Method overloading, and optional params

````java
/*   
 * Name: TestMethodOverloading
 * CSU ID: 
 * CIS 265: Review
 * Description: Provides implementation for overloading methods
 *
*/
public class TestMethodOverloading {
        /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Print max values
        System.out.println("The max (10, 2) is: " + max(10,2));
        System.out.println("The max (10, 2, 6, 11) is: " + max(10,2, 6, 11));
        System.out.println("The max (1.0, 2.0) is: " + max(1.0,2.0));
        System.out.println("The max (1.0, 2.0, 3.0, 4.5) is: " + max(1.0,2.0, 3.0, 4.5));

        System.out.println(":: end-of-program ::");
    }

    /**
     * Gets the max of the doubles provided
     */
    public static double max(double first, double second){
        // Don't duplicate implementation
        return max(first, new double[]{ second });
    }
    
    /**
     * Gets the max of the values provided
     */
    public static double max(double first, double... more){
        double max = first;
        //
        // Loop on the items, and if there is one greater than our max, save it
        for( int i = 0; i < more.length; i++){
            if(max < more[i]) {
                max = more[i];
            }
        }

        System.out.println("The max is: " + max);
        return max;
    }
     /**
     * Gets the max of the ints provided
     */
    public static double max(int first, int second){
        // Don't duplicate implementation
        return max(first, new int[]{ second });
    }
    
    /**
     * Gets the max of the values provided
     */
    public static int max(int first, int... more){
        int max = first;
        //
        // Loop on the items, and if there is one greater than our max, save it
        for( int i = 0; i < more.length; i++){
            if(max < more[i]) {
                max = more[i];
            }
        }

        System.out.println("The max is: " + max);
        return max;
    }
   
}
````
