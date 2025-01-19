---
title: String Work
---

````java
/*   
 * Name: StringWork
 * CSU ID: 
 * CIS 265: Review
 * Description: Working with strings
 *
*/
import java.util.Scanner;

public class StringWork {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args){

        //
        // Create a scanner, using a resource boundry
        try(Scanner input = new Scanner(System.in))
        {     
            // Prompt
            System.out.print("Enter three words seperated by a space: ");

            // Parse the input: next() retreices the chars up to the next space
            String first = input.next();
            String second = input.next();
            String third = input.next();

            System.out.println("first: " + first);
            System.out.println("second:" + second);
            System.out.println("third:" + third);

            // Prompt
            System.out.print("Enter a statement: ");

            // reads the full line as a string
            String line = input.nextLine();
            System.out.println("You entered: " + line);

            // Prompt
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            char arg = word.charAt(0);

            System.out.print("Character entered: " + arg);       
            
        }
    }           
}

````
