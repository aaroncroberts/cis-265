---
title: Math Work
categories: [ 'java', 'math','code samples' ]
date: 2025-01-20
---

Examples working with the Math library

````java
/*   
 * Name: MathWork
 * CSU ID: 
 * CIS 265: Review
 * Description: Exmaples with the Math library
 *
*/
import java.util.Scanner;

public class MathWork {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            //
            // Rounding
            System.out.println("Celing, Floor, and Round: ");
            System.out.println("------------------------------------");
            System.out.println("Math.floor(3.5):  " + Math.floor(3.5));
            System.out.println("Math.ceil(3.5):  " + Math.ceil(3.4));
            System.out.println("Math.round(3.5):  " + Math.round(3.5));
            System.out.println("Math.rint(2.3):  " + Math.rint(2.3));
            System.out.println();
            

            //
            // Trig
            double degrees = 30;
            System.out.println("Trig functions: ");
            System.out.println("------------------------------------");
            System.out.println("Math.toRadians(30):  " + Math.toRadians(degrees));
            System.out.println("Math.sin():  " + Math.sin(Math.toRadians(degrees)));
            System.out.println("Math.cos():  " + Math.cos(Math.toRadians(degrees)));
            System.out.println("Math.tan():  " + Math.tan(Math.toRadians(degrees)));
            System.out.println();

            //
            // Exponential 
            System.out.println("Exponent functions: ");
            System.out.println("------------------------------------");
            System.out.println("Math.log(10.0):  " + Math.log(10.0));
            System.out.println("Math.pow(2,3):  " + Math.pow(2,3));
            System.out.println("Math.sqrt(25.0):  " + Math.sqrt(25.0));
            System.out.println("Math.exp(1):  " + Math.exp(1));
            System.out.println();
        
            //
            // Evaluation
            System.out.println("Evaluation functions (min, max, abs): ");
            System.out.println("------------------------------------");
            System.out.println("Math.min(1.0, 2.0):  " + Math.min(1.0, 2.0));
            System.out.println("Math.max(1.0, 2.0):  " + Math.max(1.0, 2.0));
            System.out.println("Math.abs(-3.5):  " + Math.abs(-3.5));
            System.out.println();

            //
            // Random
            System.out.println("Random: ");
            System.out.println("------------------------------------");
            System.out.println("Math.random(): [0.0-1.0] " + (int)(Math.random() * 100) / 100.0);
            System.out.println("Math.random(): [0 - 99] " + (int)(Math.random() * 100.0));
            System.out.println("Math.random(): [50 - 99] " + (50 + (int)(Math.random() * 50)));
            System.out.println("Math.random(): [2 - 10] " + (2 + (int)(Math.random() * 9.0)));
            System.out.println();

            System.out.println(":: end-of-program ::");            
        }
    }             
}

````
