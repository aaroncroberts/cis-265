
/*   
 * Name: MultiDimensionArrays
 * CSU ID: 
 * CIS 265: Review
 * Description: Work with multi-dimension arrays
 *
*/
import java.util.Scanner;

public class MultiDimensionArrays {
    /**
     * Main entrty point for the program
     */
    public static void main(String[] args){
        
        //
        // Basic initialiation - inline
        // - child elements are arrays themselves
        int[][] sample ={
            { 1, 1},
            { 1, 1}
        };

        //
        // Ragged array - mixed lengths of child elements
        int[][] ragged = {
            { 1, 2, 3 },
            { 1, 2, 3, 4, 5},
            { 1 ,2, 3, 4, 5, 6}
        };

        //
        // Get a matrix from a method
        int[][] matrix = getMatrix(3,3);
        
        // Get the sum of the matrix rows and columns
        int sum = sum(matrix);

        // Print the matrix
        printMatrix(matrix);

        //
        System.out.println("Sum total: " + sum);
        System.out.println();

        System.out.println(":: end-of-program ::");        
    } 
    
    /**
     * Creates a multi-dimension array of integers
     * 
     * @param rows the number of rows in the matrix
     * @param columns the number of columns in the matrix
     * 
     * @return matrix of integers
     */
    public static int[][] getMatrix(int rows, int columns){
        //
        // Create a mutli-dimension array
        int[][] matrix = new int[rows][columns];

        try(Scanner input = new Scanner(System.in))
        {
            // Display what we are doing
            System.out.println("Creating matrix w/ " + rows + " rows and " + columns + " columns");
            int value = -1;

            //
            // Get data for each row and column
            for( int i = 0; i < rows; i++ ){
                for(int j = 0; j < columns; j++ ) {
                    //
                    // Collect valid input from the user
                    // - must get an integer
                    do {
                        try {
                            System.out.println("| row: " + (int)(i + 1) + ", column: " + (int)(j + 1)  + " |");
                            String line = input.nextLine();

                            // Try to parse the int
                            value = Integer.parseInt(line);
                            
                            //
                            // We have a real value, so set it and continue
                            matrix[i][j] = value;
                        }
                        catch(Exception error){
                            // Error
                            System.out.println("Whoops! Let's try that again...");
                            value = -1;
                        }                        
                    }
                    while(value < 0);                    
                }
            }            
        }

        return matrix;
    }

    /**
     * Sums the totals for all columns and rows in the matix
     * 
     * @param matrix a multi-dimension array to sum totals 
     * 
     * @returns the sum total of all rows and columns in the matrix
     */
    public static int sum(int[][] matrix) {
        int total = 0;

        // Sum all the columns and rows
        for( int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[0].length; j++ ) {
                total += matrix[i][j];
            }
        }

        return total;
    }

    /**
     * Prints the matrix elements to the output
     */
    public static void printMatrix( int[][] matrix){

        // Display
        System.out.println("Matrix has " + matrix.length + " rows, and " + matrix[0].length + " columns:");

        // Loop on the items and print them out.
        for( int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[0].length; j++ ) {
                // Print each item with a space
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next row
            System.out.println();
        }
        System.out.println();
    }

}
