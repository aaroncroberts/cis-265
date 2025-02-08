---
title: Subtraction Quiz
categories: [ 'java', 'math', 'code samples']
date: 2025-01-20
---

````java
/*   
/*   
 * Name: AdditionQuiz
 * CSU ID: 
 * CIS 265: Review
 * Description: Addition quiz
 *
*/

import java.util.Scanner;

public class SubtractionQuiz {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            int number1 = (int)(Math.random());
            int number2 = (int)(Math.random());

            // order the numbers for easier math
            if( number1 < number2 ) {
                int temp = number1;
                
                // swap the numbers
                number1 = number2;
                number2 = temp;
            }

            System.out.println("Solve: " + number1 + " - " + number2 + " = ?");
            
            // Get the user's answer
            int answer = input.nextInt();

            // Display the output
            System.out.println(number1 + " - " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        }

        System.out.println(":: end-of-program ::");
    }
}
````