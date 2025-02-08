---
title: Random Characters
categories: [ 'java', 'math', 'code samples' ]
date: 2025-01-20
---

Generates random characters using the Math library.

````java
/*   
 * Name: RandomCharacters
 * CSU ID: 
 * CIS 265: Review
 * Description: Generates random characters unsing math.random and unicode
 *
*/
import java.util.Scanner;

public class RandomCharacters {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {     
            //
            // Unicode range 0 - 65535
            // - the +1 is becuase random() os 0.0 - 1.0. +1 then includes 65535.
            int number = (int)Math.random() * 65535 + 1;

            // Get a random character
            char character = (char)('a' + Math.random() * ( 'z' - 'a' + 1));

            System.out.println("Selected: " + character);

        }
    }
}


````
