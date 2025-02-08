---
title: Simple If Demo
categories: [ 'java', 'logic', 'code samples' ]
date: 2025-01-20
---

````java
/*   
 * Name: ComputeAverage
 * CSU ID: 
 * CIS 265: Review
 * Description: Computes the average of three input numbers
 *
*/
public class SimpleIfDemo {
    /*
     *  Main entry point for the program 
     * - incorrect calculation for C - F
     * - should be °F = (°C × 9/5) + 32
     */    
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();

        long seconds = totalMilliseconds % 1000;

        if( seconds < 10 ){
            System.out.println("Oh no!");
        } 
        else {
            System.out.println("Success!");
        }

        System.out.println(":: end-of-program ::");
    }
}
````
