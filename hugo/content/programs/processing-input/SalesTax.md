---
title: Sales Tax
categories: [ 'sample-code', 'java', 'math' ]
---

````java
/*   
 * Name: SalesTax
 * CSU ID: 
 * CIS 265: Review
 * Description: Caluclates sales tax
 *
*/
import java.util.Scanner;

public class SalesTax {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter a purchase amount:");
            double purchase = input.nextDouble();
            
            // Calculate the tax
            double tax = purchase * 0.06;

            //
            // Clip to 2 decimal places
            // - * 100 shifts the decimal two to the right
            // - cast as int then trims the value to no decimals
            // - dividing by 100 then shifts the decimal back to the left
            //
            System.out.println("Sales tax @ 6% is: $" + (int)(tax * 100)/100.0);
        }

        System.out.println(":: end-of-program ::");
    }    
}
````
