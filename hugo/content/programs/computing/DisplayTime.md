---
title: Display Time
categories: [ 'sample-code', 'java', 'string' ]
date: 2025-01-20
---

````java
/*   
 * Name: DisplayTime
 * CSU ID: 
 * CIS 265: Review
 * Description: Displays time 
 *
*/

import java.util.Scanner;

public class DisplayTime {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args){

        //
        // Create a scanner, using a resource boundry
        try(Scanner input = new Scanner(System.in))
        {
            int seconds;
            System.out.print("Enter an integer for seconds (> 60): ");
            
            // read the input stream for an integer 
            // until we get a value > 60
            do {
                seconds = input.nextInt();                
            } while (seconds < 60);
            
            //
            // Since we have a number greater than 60, calculate
            // the minutes and remaining seconds
            int minutes = seconds / 60;
            int remaining = seconds % 60;

            // Print our output
            System.out.println(seconds + " seconds is " + minutes + " minutes and " + remaining + " seconds");
            System.out.println(":: end-of-program ::");
        }
    }    
}
````
