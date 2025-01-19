---
title: Decimal To Hex
categories: [ 'sample-code', 'java', 'conversion' ]
---

````java
/*   
 * Name: DecToHex
 * CSU ID: 
 * CIS 265:  Converts a decimal to hex
 *
*/
import java.util.Scanner;

public class DecimalToHex {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {     
            //
            // Get a decimal
            System.out.println("Enter a decimal number: ");
            int number = input.nextInt();

            String hex = "";

            while( number != 0 ){
                int hexValue = number % 16;
                
                // Get the hex Digit
                char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
                
                hex = hexDigit + hex;
                number = number / 16;
            }

            // Output the hex
            System.out.println("The hex number is: " + hex);
            System.out.println(":: end-of-program ::");
        }
    }            
}

````
