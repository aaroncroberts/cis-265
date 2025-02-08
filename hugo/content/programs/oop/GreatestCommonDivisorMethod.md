---
title: Greatest Common Divisor Method
categories: ['java', 'oop', 'code samples' ]
date: 2025-01-20
---

Encapsulates the Greate Common Divisor logic into a method

````java
/*   
 * Name: GreatestCommonDivisonMethod
 * CSU ID: 
 * CIS 265: Review
 * Description: Calculates the greatest common divisor and encapsulates the process into a method
*/
import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    /**
     * Main entry point for the program
     * 
     * @param  args arguments for the program
     * @return void
    */
    public static void main(String[] args ){
        //
        // Collect input from the user for calculating the gcd of two numbers
        try(Scanner input = new Scanner(System.in))
        {
            //
            // Get some integers to calc gcd
            System.out.println("Enter a integer: ");
            int number1 = input.nextInt();

            System.out.println("Enter a second integer: ");
            int number2 = input.nextInt();

            // Call our method to calc gcd
            int gcd = gcd(number1, number2);

            // Output the result
            System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
        }
    }
    /**
     * Calcuates the greatest common divisor
     * 
     * @param number1 the first number
     * @param number2 the second number
     * @return the greatest common divisor of the two numbers
     */
    public static int gcd(int number1, int number2){
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

        return gcd;
    }
}

````