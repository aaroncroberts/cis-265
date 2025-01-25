/*   
 * Name: PrimeNumberMethod
 * CSU ID: 
 * CIS 265: Review
 * Description: Calcuates prime numbers, encapslating logic into a method
 *
*/
import java.util.Scanner;

public class PrimeNumberMethod {
    // Setup some constants
    static final int NUMBER_OF_PRIMES = 50;
    static final int NUMBER_OF_PRIMES_PER_LINE = 10;
    
    /**
     * Main entry point for the program
     * 
     * @param args the arguements for the program
     */
    public static void main(String[] args) {
            
        try(Scanner input = new Scanner(System.in))
        {
            int primes = 0;

            do{
                System.out.println("Enter the number of primes [1-100] to print: [eg. 12]");
                primes = input.nextInt();                
            }
            while(primes <= 0 || primes > 100);

            // print the primes
            printPrimes(primes);                        
        }
    
        System.out.println(":: end-of-program ::");
      
    } 
    
    /**
     * Prints prime numbers to the console
     * 
     * @param numberOfPrimes the number of primes to print to the output
     * 
     */
    public static void printPrimes(int numberOfPrimes){
        int count = 0;
        int number = 2;            

        // Loop until we hit our max prime output
        while(count < numberOfPrimes){

            boolean prime = isPrime(number);
            
            // Output the number
            if(prime) {

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
    }

    /**
     * Determines if the number is prime
     * 
     * @param number the number to determine prime
     * @return boolean value indicating if the number is prime
     */
    public static boolean isPrime(int number){
        boolean isPrime = true;

        // Search for a divisor
        for(int divisor = 2; divisor <= number / 2; divisor++){
            
            // If the number divides evenly, it is not prime
            if(number % divisor == 0 ){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
