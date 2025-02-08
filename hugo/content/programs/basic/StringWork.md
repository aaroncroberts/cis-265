---
title: String Work
categories: [ 'sample-code', 'java', 'strings' ]
date: 2025-01-20
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
            System.out.println();  

            //
            // Character class
            System.out.println("Characters:");  
            System.out.println("-------------------------------------");  
            System.out.println("Character.isDigit('g'): " + Character.isDigit('g'));  
            System.out.println("Character.isLetter('g'): " + Character.isLetter('g'));  
            System.out.println("Character.isUpperCase('g'): " + Character.isUpperCase('g'));  
            System.out.println("Character.toUpperCase('g'): " + Character.toUpperCase('g'));  
            System.out.println("Character.toLowerCase('g'): " + Character.toLowerCase('G'));  
            System.out.println();  

            //
            // String operations
            System.out.print("Enter a word to examine: ");
            word = input.nextLine();

            System.out.print("length(): " + word.length());
            System.out.print("first character: " + word.charAt(0));
            System.out.print("last character: " + word.charAt(word.length() -1));
            System.out.print("substring(0, 2): " + word.substring(0, 1));                                                
        }
    }           
}
````
