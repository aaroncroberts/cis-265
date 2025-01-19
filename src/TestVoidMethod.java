/*   
 * Name: TestVoidMethod
 * CSU ID: 
 * CIS 265: Review
 * Description: Provides an implementation for a method that returns void
 *
*/
public class TestVoidMethod {
        /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Print some grades
        System.out.println("The score is: ");
        printGrade(78.5);

        System.out.println("The score is: ");
        printGrade(59.5);
    }

    /**
     * Prints the grade based on the score provided
     */
    public static void printGrade(double score){
        
        if(score >= 90.0){
            System.out.println("A");
        }
        else if( score >= 80.0) {
            System.out.println("B");
        }
        else if( score >= 70.0) {
            System.out.println("C");
        }
        else if( score >= 60.0) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
