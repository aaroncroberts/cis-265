---
title: Compute Area With Console Input
categories: [ 'java', 'code samples' ]
date: 2025-01-20
---

````java
import java.util.Scanner;

/*   
 * Name: ComputeAreaWithConsoleInput
 * CSU ID: 
 * CIS 265: Review
 * Description: Computes the Area of a circle using input from the console
 *
*/
public class ComputeAreaWithConsoleInput {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner with a resource boundry
        // - this cleans up memory and closes the input stream
        try (Scanner input = new Scanner(System.in)) 
        {
            //
            // Get a value for the radius from the user
            // - nextDouble will parse the input as a double
            System.out.println("Enter a value for the radius:");
            double radius = input.nextDouble();
            

            // Compute the area
            double area = radius * radius * 3.14159;

            // Output
            System.out.println("The area of a circle with radius " + radius + " is approx: " + area);
            System.out.println(":: end-of-program ::");
        }
    } 
}
````
