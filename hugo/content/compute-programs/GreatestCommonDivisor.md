---
title: Greatest Common Divisor
---

Takes in two integers and determines the greatest common divisor.

````java
/*   
 * Name: GreatestCommonDivisor
 * CSU ID: 
 * CIS 265: Review
 * Description: Gets the greates common divisor of two numbers
 *
*/
import java.util.Scanner;

public class GreatestCommonDivisor {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {     
            //
            // Get some integers to calc gcd
            System.out.println("Enter a integer: ");
            int number1 = input.nextInt();

            System.out.println("Enter a second integer: ");
            int number2 = input.nextInt();

            // start at 1
            int gcd = 1;
            int possible = 2;
            
            // Search for the greatest common divisor.
            // - largest value less than the numbers that divides evenly
            while (possible <= number1 && possible <= number2){

                // If the possible can divide both, its a common factor
                if(number1 % possible == 0 && number2 % possible == 0){
                    gcd = possible;
                }

                // increment to continue the loop
                possible++;
            }

            // Display the gcd
            System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
            System.out.println(":: end-of-program ::");
        }        
    }            
}


````
