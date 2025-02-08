---
title: Analyze Numbers
categories: [ 'java', 'arrays','code samples' ]
date: 2025-01-20
---

Creates an array and analyzes the input

````java

/*   
 * Name: AnalyzeNumbers
 * CSU ID: 
 * CIS 265: Review
 * Description: Analayzes numbers collected by the user
 *
*/
import java.util.Scanner;

public class AnalyzeNumbers {
    /**
     * Main entrty point for the program
     */
    public static void main(String[] args){

        //
        // Initialization
        double[] numbers;
        int size = 0;
        double sum = 0.0;
        double average = 0.0;    

        try(Scanner input = new Scanner(System.in))
        {
            do{
                System.out.println("Enter collection size: [eg. 5]");
                size = input.nextInt();                
            }
            while(size <= 0);

            // init the array
            numbers = new double[size];

            System.out.println("Set values in the array:");                
            for(int i = 0; i < numbers.length; i++ ){
                System.out.println("Set item["+ i+ "]: ");
            
                // Set the item in the array
                numbers[i]= input.nextDouble();
                
                // add to the sum
                sum += numbers[i];
            }   

            System.out.println("Doing math things...");                           
            
            //
            average = sum / size;            
            int above = 0;

            // Count how many are above average
            for( int i = 0; i < numbers.length; i++){
                if(numbers[i] > average){
                    above++;
                }
            }
            
            // Print our output
            System.out.println("-----------------------------------");
            System.out.println("Items: " + numbers.length);
            System.out.println("Sum Total: " + sum);
            System.out.println("Average: " + (int)(average * 100) / 100.0);
            System.out.println("Above Average: " + above);            
        }       
        
        System.out.println(":: end-of-program ::");        
    }    
}
````
