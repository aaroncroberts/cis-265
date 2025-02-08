---
title: Compute Area With Constant
categories: [ 'sample-code', 'java' ]
date: 2025-01-20
---

````java
/*   
 * Name: ComputeAreaWithConstant
 * CSU ID: 
 * CIS 265: Review
 * Description: Uses the constant for PI for the area compute
 *
*/
public class ComputeAreaWithConstant {
     /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        double radius;
        doube area;

        // assign the radius
        radius = 20;
        
        // Compute the area
        area = radius * radius * Math.PI;

        // Output
        System.out.println("The area of a circle with radius " + radius + " is approx: " + area);
        System.out.println(":: end-of-program ::");
    }    
}
````
