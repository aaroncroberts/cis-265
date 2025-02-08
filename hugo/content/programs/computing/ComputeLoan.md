---
title: Compute Load
categories: [ 'java', 'math', 'code samples' ]
date: 2025-01-20
---

````java
/*   
 * Name: ComputeLoan
 * CSU ID: 
 * CIS 265: Review
 * Description: Computes a load value
 *
*/
import java.util.Scanner;

public class ComputeLoan {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            // Interest rate
            System.out.println("Enter annual interest rate [eg. 5.6]:");
            double annualRate = input.nextDouble();

            // calculate the monthly rate
            double monthlyRate = annualRate / 1200;

            // Get the years
            System.out.println("Enter years [eg. 20,30]:");
            int years = input.nextInt();

            // Get the load amount
            System.out.println("Enter loan amount [eg. 120000]:");
            double loan = input.nextDouble();

            // Calc the monthly payment
            double monthlyPayment = loan * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            // Display the calculation
            System.out.println("Monthly payment is: $" + (int)(monthlyPayment * 100)/ 100.0);
            System.out.println("Total payment is: $" + (int)(totalPayment * 100)/ 100.0);
        }

        System.out.println(":: end-of-program ::");
    }  
}
````
