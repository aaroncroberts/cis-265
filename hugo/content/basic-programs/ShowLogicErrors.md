---
title: Show Logic Errors
---

````java
/*   
 * Name: ShowLogicErrors
 * CSU ID: 
 * CIS 265: Review
 * Description: Illustrates logic errors in programs 
 *
*/
public class ShowLogicErrors {
    /*
     *  Main entry point for the program 
     * - incorrect calculation for C - F
     * - should be °F = (°C × 9/5) + 32
     */    
    public static void main(String[] args){
        System.out.println("Celsius 35 is Fahrenheit ");
        System.out.println((9 / 5) * 35 + 32);
        
        //
        // Correct:
        // System.out.println((9.0 / 5) * 35 + 32);

        //
        // Java will treat 9 as an int, 
        // : 9 / 5 = 1, no remainder
        // : must use a double be precise for the conversion
    }
}
````
