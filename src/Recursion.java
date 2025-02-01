/*   
 * Name: SalesTax
 * CSU ID: 
 * CIS 265: Review
 * Description: Caluclates sales tax
 *
*/
import java.util.Scanner;

public class Recursion {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
       
        //recurse(10);

        // 
        // recurse3(5678);
        //System.out.print(recurse4(-1));
        //System.out.print(recurse5(4));
        //System.out.print(recurse6(20));
        //System.out.print(recurse7(6));
        //recurse8(10);
        SafeVarargsystem.out.print(recurse9(4));

        System.out.println();
        System.out.println(":: end-of-program ::");
    }

    /**
     * Recursive function 3
     */
    public static void recurse_three(int n) {
        if (n > 0) {
            System.out.print(n % 10 + " ");
            recurse_three(n / 10);
        }            
    }

    /**
     * Recursive function 4
     */
    public static int recurse_four(int n ){
        if (n == 0){
            return 0;
        }        
        else{
            return recurse_four(n-1);
        }        
    } 

    /**
     * Recursive function 5
     */
    public static int recurse_five(int n ){
        if (n == 0){
            return 1;
        }            
        else{
            return n * recurse_five(n/2);
        }        
    } 
    
    /**
     * Recursive function 6
     */
    public static int recurse_six(int n ){
        if (n == 0){
            return 1;
        }            
        else{
            return n * recurse_six(n/2);
        }        
    }  
   
    /**
     * Recursive function 7
    */
    public static int recurse_seven(int n ){
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }            
        else {
            return recurse_seven(n-2)+ recurse_seven(n/2);
        }            
    }  

    /**
     * Recursive function 8
     */
    public static void recurse_eight(int n ){
        if (n <= 0){
            System.out.print(n);
        }    
        else {
            recurse_eight(n-1);
            System.out.print(n + " ");
            
            recurse_eight(n-2);
        }
    }  
    
    /**
     * Resursive function 9
     */
    public static int recurse_nine(int n ){
        if (n <= 0){
            return 1;
        }
        else {
            return recurse_nine( recurse_nine(n-1) / 2 ) + n;
        }
    }  
}
