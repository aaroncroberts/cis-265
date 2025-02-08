---
title: Compute And Interpret BMI
categories: [ 'java', 'rounding', 'code samples' ]
date: 2025-01-20
---

````java
/*   
 * Name: AdditionQuiz
 * CSU ID: 
 * CIS 265: Review
 * Description: Addition quiz
 *
*/
import java.util.Scanner;

public class ComputeAndInterpretBMI {
    /**
     * Main entry point of the program
     */
    public static void main(String[] args) {
         
        try(Scanner input = new Scanner(System.in))
        {
            // Collection the weight input
            System.out.println("Enter a wieght in pounds [eg. 125]: ");
            double weight = input.nextDouble();

            // Collection the height input
            System.out.println("Enter a height in inches [eg. 60.5]: ");
            double height = input.nextDouble();
            
            //
            // Set constants for conversion
            final double KILOGRAMS_PER_POUND = 0.45359237;
            final double METERS_PER_INCH = 0.0254;
            
            // Convert the measurements
            double weightInKilograms = weight * KILOGRAMS_PER_POUND;
            double heightInMeters = height * METERS_PER_INCH;

            // Make the bmi calculation
            double bmi = weightInKilograms / ( heightInMeters * heightInMeters);

            // Display the output
            System.out.println("BMI: " + (int)(bmi * 100) / 100.0;
            String message = "";

            // Interpret the value
            if(bmi < 18.5) {
                message = "Underweight";
            }
            else if( bmi < 25) {
                message = "Normal";
            }
            else if( bmi < 30 ) {
                message = "Overweight";
            }
            else{
                message = "Obese";
            }
            
            // Display our result
            System.out.println("Interpretation: BMV value of " + (int)(bmi * 100) / 100.0 + " is " + message);
        }
    }
}
````
