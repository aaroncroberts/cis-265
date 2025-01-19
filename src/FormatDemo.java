/*   
 * Name: HexDigiFormatDemotToDec
 * CSU ID: 
 * CIS 265: Review
 * Description: Illustrates formating with printf()
 *
*/
import java.util.Scanner;

public class FormatDemo {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {     
            //
            // Format some strings       
            // - note the new line \n
            System.out.printf("%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sin()", "Cos()");
            
            int degrees = 30;
            double radians = Math.toRadians(degrees);

            //
            // Output formated integers and floats
            // - note the new line \n
            System.out.printf("%-10d%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians));
        }
    }
}
