---
title: Multiplication Table
categories: ['java', 'oop','code samples' ]
date: 2025-01-20
---

Outputs formatted multiplicaton tables.  Allows input from user to specify a value between 1-10.

````java
/*   
 * Name: MultiplicationTable
 * CSU ID: 
 * CIS 265: Review
 * Description: Prints multiplication tables to the output
 *
*/
import java.util.Scanner;

public class MultiplicationTable {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            int number = 11;

            // Get a number from the user
            do {
                System.out.println("Enter a number betwen 1-10:");
                number = input.nextInt();
            }
            while( number > 10 );
            
            System.out.println("Multiplication Table");
            System.out.println();
            System.out.print("   ");

            // output the number header
            for( int i = 1; i <= number; i++){
                System.out.printf("%4d", i);
            }
            System.out.println();

            // output the seperater
            for( int i = 1; i <= 5 * number; i++){
                System.out.print("-");
            }
            System.out.println();

            // output each number and the multiple
            for(int i = 1; i <= number; i++){     

                System.out.printf(i + " |");
                for(int j = 1; j <= number; j++){
                    System.out.printf("%4d", i * j);
                } 
                System.out.println();
            }

            System.out.println(":: end-of-program ::");            
        }
    }             
}
````
