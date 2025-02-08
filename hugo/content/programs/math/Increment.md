---
title: Increment
categories: ['java', 'oop','code samples' ]
date: 2025-01-20
---

Provides a sample for incrementing variables in and outside of methods.

````java
/*   
 * Name: Increment
 * CSU ID: 
 * CIS 265: Review
 * Description: Illustrates incrementing variables in and out of scope of methods
 *
*/
public class Increment {
    /*
     * Main entry point for the program 
    */
    public static void main(String[] args){
        
        int x = 0;
        System.out.println("x is: " + x);
        increment(x);

        // After increment
        System.out.println("after calling increment(), x is: " + x);
        
        System.out.println(":: end-of-program ::");
    }

    /**
     * Increments the value passed
     */
    public static void increment(int value){
        value++;
        System.out.println("incremented value to: " + value);
    }
}
````
