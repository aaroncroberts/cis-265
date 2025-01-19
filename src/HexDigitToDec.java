/*   
 * Name: HexDigitToDec
 * CSU ID: 
 * CIS 265: Review
 * Description: Converts Hex to Decimal
 *
*/
import java.util.Scanner;

public class HexDigitToDec {
    /**
     * Main entry point for the program
     */
    public static void main(String[] args) {
        //
        // Create a scanner for reading input 
        try(Scanner input = new Scanner(System.in))
        {            
            String hexString;

            // Get a character from the input
            do {
                System.out.println("Enter a single character [eg. A]:");
                hexString = input.nextLine();
            }
            while(hexString.length() != 1);

            // Upper case the character that was input
            char ch = Character.toUpperCase(hexString.charAt(0));

            if('A' <= ch && ch <= 'F') {
                int value = ch - 'A' + 10;
                System.out.println("The decimal value for digit: " + ch + " is : " + value);
            }
            else if (Character.isDigit(ch)) {
                // already a digit
                System.out.println("The hex value for digit: " + ch + " is : " + ch);
            }
            else {
                System.out.println(ch + " is an invalid input!");
            }

            System.out.println(":: end-of-program ::");
        }
    }
}
