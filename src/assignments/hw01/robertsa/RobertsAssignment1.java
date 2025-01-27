package robertsa;
/*   
 * Name: Main
 * CSU ID: 6003115
 * CIS 265: Assignment 1
 * Description: A program that allows a user to create song objects, then display them at the console 
*/
import java.util.Scanner;
import robertsa.Song;

/**
 * The Main class
 */
public class RobertsAssignment1 {
    /**
     * Main entry point for the program
     * 
     * @param args program arguments
     * 
     */    
    public static void main(String[] args){
        //
        // Create a scanner to allow user input
        try(Scanner input = new Scanner(System.in)){

            //
            // Collect valid input from the user
            int numberOfSongs = promptForInt(input, "How many songs do you have (1-10): ", 10);
            
            // Create an array of songs
            Song[] songs = new Song[numberOfSongs];
    
            // Loop on the songs, and prompt user for input
            for(int i = 0; i < songs.length; i ++){

                String title = promptForString(input, "Song " + (int)(i + 1) + " title: ");
                String artist = promptForString(input, "Song " + (int)(i + 1) + " artist: ");
                int year = promptForInt(input, "Song " + (int)(i + 1) + " year: ", 2025);

                // Create the song with the properties
                songs[i] = new Song(title, artist, year);
            }
            
            //
            // Print the songs
            for( Song s: songs){
                // Foreach song, print using the toString() method we created
                System.out.println(s);
            }            
        }
        catch(Exception error){
            // Error handling for the Scanner
            System.out.println("Oops! We've had a problem...");
            System.out.println(error.getMessage());
        }
            
        System.out.println("Goodbye.");
    }  

    /**
     * Prmompts the user for an integer
     * 
     * @param input the scanner stream to read data from
     * @param message the message to display
     * @param max the maximum value for the integer
     *
     * @return number from user input
     */
    public static int promptForInt(Scanner input, String message, int max){
        //
        // the value to collect
        int value = 0;

        // Use the input stream and prompt the user        
        do{
            try {                    
                
                // Collect the input
                System.out.print(message);
                value = input.nextInt();   
                
                // Validate
                if( value > max || value < 1 ){
                    System.out.println("I cannot create " + value + "!");
                } 
                
                input.nextLine();
            }
            catch(Exception error){
                // Error
                System.out.println("Whoops! Let's try again...");                     
                value = 0;
            }                    
        }
        while(value <= 0 || value > max);            
        
        return value;
    }

    /**
     * Prompts the user for a string, using the supplied message
     *
     * @param input the scanner stream to read data from
     * @param message the message to display for the prompt
     * 
     * @return a string collected from the user that is not null or "" 
     */
    public static String promptForString(Scanner input, String message){
        String value = null;

        do{
            try {                    
                
                // Display a message and collect the input
                System.out.print(message);                
                value = input.nextLine();  
                
                // Read the next ling
                //input.nextLine();                                   
            }
            catch(Exception error){
                // Error
                System.out.println("Whoops! Let's try again...");                     
                value = null;
            }                    
        }
        while(value == null || value == "");            
        
        return value;
    }
}
