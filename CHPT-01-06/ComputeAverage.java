import java.util.Scanner;

/*
 * Computes the average of three input numbers
 */
public class ComputeAverage {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        double radius;
        doube area;

        // Create a Scanner to read input from the console
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter three numbers (int/double):");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute the average
        double average = (number1 + number2 + number3) / 3;

        // Display the output
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is " + average);
    } 
}
