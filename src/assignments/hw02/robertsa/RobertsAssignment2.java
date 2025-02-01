package robertsa;
import java.io.BufferedReader;
/*   
 * Name: RobertsAssignment2
 * CSU ID: 6003115
 * CIS 265: Assignment 2
 * Description: A program that reads a file translates each row in the file into a song
*/
import java.io.File;
import java.io.FileReader;

/**
 * The Main class
 */
public class RobertsAssignment2 {
    /**
     * Main entry point for the program
     * 
     * @param args [0] path to the file
     * 
     */    
    public static void main(String[] args){

        //
        // process the arguments passed to the program
        // and get a file object at the specified path
        File file = processArgs(args);
        
        if( file != null ){
        
            // Create an array of songs
            Song[] songs = createSongs(file);
        
            //
            // Print the songs
            for( Song s: songs){
                // Foreach song, print using the toString() method we created
                System.out.println(s);
            }                        
        }
        else{                
            // No file
            System.out.println("No file found! Check the path...");
        }
                
        System.out.println("Goodbye.");
    }  

    /**
     * Processes the arguments and provides path for a file
     * from args[0]
     * 
     * @param args the argument array to get the path from
     * @return File instnace from args[0]
     * 
     */
    public static File processArgs(String[] args){        
        File file;

        // Validate
        if( args.length == 0){
            // no path provided in args
            file = null;
        }
        else {
            try{
                //
                // Try to create a file from the path                
                file = new File(args[0]);
                System.out.println("File located! Searching for songs...");
            }
            catch(Exception error){
                // unable to create a file from the path
                System.out.println("Invalid File: " + args[0]);  
                System.out.println("Error: " + error.getMessage());
                file = null;
            }                       
        }
        // return the file
        return file;
    }

    /**
     * Gets the count of rows in the file
     * 
     * @param file the file to get row counts from
     * @return The count of rows in the file
     */
    public static int getRowCount(File file){
        int lineCount = 0;

        // Create a file reader to read data from the file
        try(FileReader fr = new FileReader(file)){        
            // Create a buffered reader to read data a line at a time
            try(BufferedReader reader = new BufferedReader(fr)){
                //
                // Count each line                                
                while(reader.readLine() != null){
                    lineCount++;
                }
            }            
        }    
        catch(Exception error) {           
            // Unable to access the file
            System.out.println("Unable to get rows from file!");
            System.out.println("Error: " + error.getMessage());            
        }   
       
        return lineCount;
    }

    /**
     * Creates songs from the file
     * - each line is read, and parsed into a Song instance
     * - invalid lines will not create songs
     * 
     * @param file the file that contains the song data
     * @return an array of Song objects
     */
    public static Song[] createSongs(File file){
        // Our result to return
        Song[] songs;

        // Determine how may songs to make
        int count = getRowCount(file); 

        //
        // If we don't have rows, we don't have songs
        if( count == 0 ){
            //
            System.out.println("There were now rows in the file...");  
        }
        else {            
            //
            // There is data in the file, so proceed to create songs
            // the max number of songs is == to the number of rows in the file
            songs = new Song[count];
            int index = 0;

            // Create a file reader to read data from the file
            try(FileReader fr = new FileReader(file)){        
                // Create a buffered reader to read data a line at a time
                try(BufferedReader reader = new BufferedReader(fr)){
                
                    // while the stream is ready, read data
                    while(reader.ready()){
                        
                        // Get the line of data                    
                        String line = reader.readLine();
                                    
                        // create the song from the line (string)
                        Song song = createSongFromLine(line, ",");
                        
                        //
                        // Check that we have a song to add
                        // invalid lines will not create songs
                        if(song != null){
                            //
                            // save the song in our array, increment our index
                            songs[index] = song;
                            index++;    
                        }                    
                    }
                    
                    //
                    // Close our reader
                    reader.close();
                }
            }
            catch(Exception error) {           
                // Unable to access the file
                System.out.println("Unable to get data from file!");
                System.out.println("Error: " + error.getMessage());
            }   
        }
                        
        return songs;
    }

    /**
     * Creates a Song object from a string of data
     * - File format must be: title, artist, year
     * - year must be a valid integer 
     * 
     * @param line the string data for creating the song
     * @return Song instance 
     */
    public static Song createSongFromLine(String line, String seperator){
        Song song = null;
                
        try{
            //
            // Split the line on the seperator
            String[] values = line.split(seperator);

            // File format must be: title, artist, year
            if( values.length == 3){

                String title = values[0];
                String artist = values[1];
                int year = getYear(values[2], 2025);
                        
                //
                // Create a song:
                // - if the year is invlaid, we do not create a song
                if( year > -1){
                    song = new Song( title, artist, year);
                } 
            }
            else{
                // More than three values were found on a line
                System.out.println("Invalid Line: " + line);
            }                                  
        }
        catch(Exception error) {

            System.out.println("Invalid Line: " + line);
            System.out.println("Error: " + error.getMessage());
        }
        
        return song;
    }

    /**
     * Creates an integer year from the string year
     * 
     * @param message the year to create the integer from
     * @param max the maximum value for the integer
     *
     * @return number from the string.  If the value exceeds the max, it will set to the max
     */
    public static int getYear(String year, int max){
        //
        // the value to collect
        int value = -1;
        
        try {                    
            // Convert the number            
            value = Integer.parseInt(year);            

            if( value > max ){
                // value exceeds the limit, set to max
                value = max;
            }
        }
        catch(NumberFormatException error){
            // This was not a number
            value = -1;
        }
                    
        return value;
    }
}
