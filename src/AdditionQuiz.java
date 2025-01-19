/*   
 * Name: AdditionQuiz
 * CSU ID: 
 * CIS 265: Review
 * Description: Addition quiz
 *
*/

import java.util.Scanner;

public class AdditionQuiz {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            int number1 = (int)(System.currentTimeMillis() % 10);
            int number2 = (int)(System.currentTimeMillis() / 10 % 10);

            System.out.println("Solve: " + number1 + " + " + number2 + " = ?");
            
            // Get the user's answer
            int answer = input.nextInt();

            // Display the output
            System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        }

        System.out.println(":: end-of-program ::");
    } 
}
