/*   
 * Name: Incrementing
 * CSU ID: 
 * CIS 265: Review
 * Description: Illustrate pre and post incrementing concepts
 *
*/
public class Incrementing {
    /*
     * Main entry point for the program 
    */
    public static void main(String[] args){
        
        int i = 10;

        // Post-Increment: use i first, then change i = i + 1;
        int result = 10 * i++;

        // Output the result
        System.out.println("i: " + i + " and result: " + result);

        // Pre-Increment: change i = i + 1, then compute.
        result = 10 * (++i);

        // Output the result
        System.out.println("i: " + i + " and result: " + result);        
        System.out.println(":: end-of-program ::");
    }
}
