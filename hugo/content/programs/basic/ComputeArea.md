---
title: Compute Area
categories: [  'java', 'code samples' ]
date: 2025-01-20
---

````java
public class ComputeArea {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        double radius;
        doube area;

        // assign the radius
        radius = 20;
        
        // Compute the area
        area = radius * radius * 3.14159;

        // Output
        System.out.println("The area of a circle with radius " + radius + " is approx: " + area);
        System.out.println(":: end-of-program ::");
    }    
}
````
