---
title: Compute Angles
categories: [ 'java', 'math','code samples' ]
date: 2025-01-20
---

Computes the angles of a triangle.  Input is collected as three x,y points.

````java
/*   
 * Name: ComputeAngles
 * CSU ID: 
 * CIS 265: Review
 * Description: Computes angles of a triangle based on three points
 *
*/
import java.util.Scanner;

public class ComputeAngles {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            // Collect a year
            System.out.println("A triangle requires three points.: ");
            System.out.println("Enter three points (x,y): ");
            
            // Collect the points
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            System.out.println("P1: (" + x1 + ", " + y1 + ")");
            

            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            System.out.println("P2: (" + x2 + ", " + y2 + ")");
            
            
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();
            System.out.println("P3: (" + x3 + ", " + y3 + ")");
            
            //
            // Compute the  sides: a^2 + b^2 = c^2            
            double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3 ) * (y2 - y3));
            double b =  Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3 ) * (y1 - y3));
            double c =  Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2 ) * (y1 - y2));

            //
            // Compute the angles
            double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
            double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
            double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

            // Output
            System.out.println("The three angles are:");
            System.out.println( "- A " + "(" + x1 + ", "+ y1 + ") :" + Math.round(angleA * 100)/100.0);
            System.out.println( "- B " + "(" + x2 + ", "+ y2 + ") :" + Math.round(angleB * 100)/100.0);
            System.out.println( "- C " + "(" + x3 + ", "+ y3 + ") :" + Math.round(angleC * 100)/100.0);

        }
    }             
}


````
