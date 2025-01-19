/*   
 * Name: TestPassByValue
 * CSU ID: 
 * CIS 265: Review
 * Description: Provides an implementation of passing by value
*/
public class TestPassByValue {
        /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        
        int number1 = 0;
        int number2 = 10;

        //
        // Print some grades
        System.out.println("Swap n1: " + number1 + " with n2: " + number2);
        swap(number1, number2);

        // Print results
        System.out.println("After Swap |> n1: " + number1 + " with n2: " + number2);        
    }

    /**
     * Prints the grade based on the score provided
     */
    public static void swap(int from, int to){
        System.out.println("swapping: " + from + " with " + to);

        // Swap the value
        int temp = from;
        from = to;
        to = temp;

        System.out.println("swapped! " + from + " with " + to);    
    }
}
