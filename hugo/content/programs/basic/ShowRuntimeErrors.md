---
title: Show Runtime Errors
categories: [ 'sample-code', 'java', 'compiling' ]
date: 2025-01-20
---

````java
/*   
 * Name: ShowRuntimeErrors
 * CSU ID: 
 * CIS 265: Review
 * Description: Illustrates a runtime error with a DivideByZeroException
 *
*/
public class ShowRuntimeErrors {
    /*
     * Main entry point for the program
     * - this program generates an ArithmeticException
     */
    public static void main(String[] args){
        System.out.println("Preparing bad math...");
        System.out.println(1/0);
    }
}
````
