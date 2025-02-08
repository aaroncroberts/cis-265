---
title: Array Work
categories: [ 'sample-code', 'java', 'arrays' ]
date: 2025-01-20
---

Working with Arrays

````java
/*   
 * Name: AdditionQuiz
 * CSU ID: 
 * CIS 265: Review
 * Description: Addition quiz
 *
*/

public class ArrayWork {
    /**
     * Main entrty point for the program
     */
    public static void main(String[] args){

        //
        // Initialization
        int[] integers = { 1, 2, 3, 4, 5 };
        char[] characters = { 'a', 'b', 'c', 'd', '1' };
        float[] floats = { 1.2f, 2.2f, 3.3f };
        double[] doubles = { 1.2, 2.2, 3.3 };

        //
        // Create empty arrays, specify size
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        char[] chars = new char[3];
        chars[0] = 'A';
        chars[1] = 'b';
        chars[2] = '$';

        //
        // Accessing elements
        System.out.println("Printing numbers (w/ for):");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("number [" + i + "] : " + numbers[i]);
        }
        System.out.pintln();

        //
        // Foreach
        System.out.println("Printing numbers (w/ for-each):");
        for( int n: numbers ){
            System.out.println("n: " + n );
        }
        System.out.pintln();
        
        System.out.println(":: end-of-program ::");        
    }    
}

````
