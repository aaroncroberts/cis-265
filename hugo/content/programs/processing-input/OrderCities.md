---
title: Order Cities
categories: [ 'sample-code', 'java', 'search' ]
---

Orders two string entered at the prompt. String compare uses the compareTo() method, which performs a unicode character check.

````java
/*   
 * Name: OrderCities
 * CSU ID: 
 * CIS 265: Review
 * Description: Orders to city names
 *
*/

import java.util.Scanner;

public class OrderCities {
    /**
     * Main entry point of the program
     */
    public static void main(String[] args) {
         
        try(Scanner input = new Scanner(System.in))
        {
            // Random 2 digit number
            int lottery = (int)(Math.random() * 100);

            // Collection the weight input
            System.out.println("Enter a city name: ");
            String firstCity = input.nextLine();
                
            System.out.println("Enter a second city name: ");
            String secondCity = input.nextLine();
            
            // Compare the strings unicode characters
            if(firstCity.compareTo(secondCity) < 0 ){
                // display the order result
                System.out.println("Cities in order are: " + firstCity + ", " + secondCity);
            }   
            else{
                System.out.println("Cities in order are: " + secondCity + ", " + firstCity);
            }
            System.out.println(":: end-of-program ::");
        }
    }    
}

````
