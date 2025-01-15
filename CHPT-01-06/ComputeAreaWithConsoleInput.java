import java.util.Scanner;

/*
 * Computes the Area of a circle using input from the console
 * - input provided through the Scanner
 */
public class ComputeAreaWithConsoleInput {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        // Create a Scanner to read input from the console
        Scanner input = new Scanner(System.in);

        //
        // Get a value for the radius from the user
        // - nextDouble will parse the input as a double
        System.out.println("Enter a value for the radius:");
        double radius = input.nextDouble();

        // Compute the area
        double area = radius * radius * 3.14159;

        // Output
        System.out.println("The area of a circle with radius " + radius + " is approx: " + area);
    } 
}
