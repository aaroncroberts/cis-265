---
title: Farenheit to Celsius
categories: [ 'java', 'conversion', 'code samples' ]
date: 2025-01-20
---

````java
/*   
 * Name: FarenheitToCelsius
 * CSU ID: 
 * CIS 265: Review
 * Description: Computes F to C
 *
*/
import java.util.Scanner;

public class FarenheitToCelsius {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter a degree in Farenheit:");            
            double fahrenheit = input.nextDouble();

            // Calcuate the convesion
            double celsius = (5.0 / 9) * fahrenheit - 32;
            System.out.println(fahrenheit + " degrees Farenheit is " + celsius + " degrees Celsius");     
            System.out.println(":: end-of-program ::");       
        }
    }
}
````
