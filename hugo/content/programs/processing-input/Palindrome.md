---
title: Palindrome
categories: [ 'java', 'search' 'samples' ]
date: 2025-01-20
---

````java
/*   
 * Name: Palindrome
 * CSU ID: 
 * CIS 265: Checks a string to see if its a palindrome
 *
*/
import java.util.Scanner;

public class Palindrome {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {     
            //
            // Get some input to check
            System.out.println("Enter a string to check for Palindrome-ness: ");
            String message = input.nextLine();

            //
            // Set indexes for searching the string
            int high = message.length() - 1;
            int low = 0;
            boolean isPalindrome = true;

            while(low < high){
                // Check the charactesr
                if(message.charAt(low) != message.charAt(high)){
                    // Not the same, so kick out
                    isPalindrome = false;
                    break;
                }

                // advance the indexes
                low++;
                high--;
            }

            // Determine the palindrome-ness
            System.out.println("The word: " + message + (isPalindrome ? " is " : " is not ") + "a Palindrome");
            System.out.println(":: end-of-program ::");
        }
    }            
}
````
