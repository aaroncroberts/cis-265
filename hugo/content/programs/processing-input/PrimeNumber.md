---
title: Prime Number
categories: [ 'java', 'math' 'samples' ]
date: 2025-01-20
---

Displays a list of prime numbers using a constant to limit parts of the program

````java
/*   
 * Name: PrimeNumber
 * CSU ID: 
 * CIS 265: Review
 * Description: works with prime numbers
 *
*/
import java.util.Scanner;

public class PrimeNumber {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {     
            // Setup some constants
            final int NUMBER_OF_PRIMES = 50;
            final int NUMBER_OF_PRIMES_PER_LINE = 10;

            int count = 0;
            int number = 2;            

            // Loop until we hit our max prime output
            while(count < NUMBER_OF_PRIMES){

                boolean isPrime = true;

                // Search for a divisor
                for(int divisor = 2; divisor <= number / 2; divisor++){
                    
                    // If the number divides evenly, it is not prime
                    if(number % divisor == 0 ){
                        isPrime = false;
                        break;
                    }
                }
                
                // Output the number
                if(isPrime) {

                    // we have a prime, count it...
                    count++;

                    if( count % NUMBER_OF_PRIMES_PER_LINE == 0){
                        System.out.println(number);
                    }
                    else {
                        System.out.print(number + " ");
                    }
                }

                // Increase our number to get to the next prime
                number++;
            }

            System.out.println(":: end-of-program ::");
        }
    }            
}

````
