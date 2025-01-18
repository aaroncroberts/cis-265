import java.util.Scanner;

/*   
 * Name: ComputeChange
 * CSU ID: 
 * CIS 265: Review
 * Description: Computes the change
 *
*/
public class ComputeChange {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        double radius;
        doube area;
        //
        // Create a Scanner to read input from the console
        try(Scanner input = new Scanner(System.in))
        {
            // Get three numbers from the user
            System.out.println("Enter an amount [eg. 12.45]:");
            double amount = input.nextDouble();
            
            // shift the decimal right to start the calculation process
            int remaining = (int)(amount * 100);
            
            // Shift the decimal left, find the ones, the remainder is the change
            int ones = remaining / 100;
            remaining = remaining % 100;

            // how many quarter
            int quarters = remaining / 25;
            remaining = remaining % 25;

            // dimes
            int dimes = remaining / 10;
            remaining = remaining % 10;

            // nickles
            int nickles = remaining / 5;
            remaining = remaining % 5;

            // pennies are the remainder
            int pennies = remaining;

            // Display the output
            System.out.println("The entered amount: " + amount + " consists of:");
            System.out.println(ones + " dollars");
            System.out.println(quarters + " quarters");
            System.out.println(dimes + " dimes");
            System.out.println(nickles + " nickles");
            System.out.println(pennies + " pennies");

            System.out.println(":: end-of-program ::");
        };
    } 
}
