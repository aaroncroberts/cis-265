---
title: Leap Year
categories: [ 'sample-code', 'java', 'math' ]
date: 2025-01-20
---

````java
/*   
 * Name: LeapYear
 * CSU ID: 
 * CIS 265: Review
 * Description: Displays time 
 *
*/

import java.util.Scanner;

public class LeapYear {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args){

        //
        // Create a scanner, using a resource boundry
        try(Scanner input = new Scanner(System.in))
        { 
            System.out.println("Enter a year [eg. 1921]:" );
            int year = input.nextInt();

            // Determine if the inupt is a leap year
            // - is divisible by 4
            // - not divisible by 100
            // - not divisible by 400
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Display the output
            System.out.println("Is " + year + " a leap year? -> " + isLeapYear);
        }
    }
}
````
