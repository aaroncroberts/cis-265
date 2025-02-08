---
title: Test Return Grade Method
categories: [ 'sample-code', 'java', 'oop' ]
date: 2025-01-20
---

Provides an implementation that has a method that returns a char

````java
/*   
 * Name: TestReturnGradeMethod
 * CSU ID: 
 * CIS 265: Review
 * Description: Provides an implementation for a method that returns a value
 *
*/
public class TestReturnGradeMethod {
        /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Print some grades
        System.out.println("The score is: " + getGrade(78.5));
        System.out.println("The score is: " + getGrade(59.5));
    }

    /**
     * Prints the grade based on the score provided
     */
    public static char getGrade(double score){
        if(score >= 90.0){
            return 'A';
        }
        else if( score >= 80.0) {
            return 'B';
        }
        else if( score >= 70.0) {
            return 'C';
        }
        else if( score >= 60.0) {
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
````
