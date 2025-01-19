---
title: Lottery
---

````java

import java.util.Scanner;

public class Lottery {
    /**
     * Main entry point of the program
     */
    public static void main(String[] args) {
         
        try(Scanner input = new Scanner(System.in))
        {
            // Random 2 digit number
            int lottery = (int)(Math.random() * 100);

            // Collection the weight input
            System.out.println("Enter your lottery pick (two digits) [eg. 12]: ");
            int guess = input.nextInt();

            //
            // Get the digits to check
            int lotteryDigit1 = lottery / 10;
            int lotteryDigit2 = lottery % 10;

            int guessDigit1 = guess / 10;
            int guessDigit2 = guess % 10;

            System.out.println("Today's lottery number is: " + lottery);
            System.out.println("Your guess: " + guess);

            if( guess == lottery ){
                // exact match
                System.out.println("You matched exactly, and win $10,000!");
            }
            else if(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1){
                // Mathched, but digits cross
                System.out.println("You matched the digits, and win $3,000!");
            }
            else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2) {
                // One digit matthed
                System.out.println("You matched one digit, and win $1,000!");
            }
            else{
                System.out.println("Sorry, no match! Better luck next time...");
            }

            System.out.println("Thank you for playing today's lottery!");            
        }
    }
}
````
