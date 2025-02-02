package robertsa;

/*   
 * Name: RobertsAssignment2
 * CSU ID: 6003115
 * CIS 265: Assignment 2
 * Description: A program that reads a file translates each row in the file into a song
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

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
        String path = processArgs(args);
        File file = getFile(path);
        
        if( file != null ){
        
            //
            // Create an array of songs from the file
            Song[] songs = createSongsUsingFileReader(file);

            //
            // Print the songs
            System.out.println("Found " + songs.length + " songs!");
            for( Song s: songs){
                // Foreach song, print using the toString() method we created
                System.out.println(s);
            }                        
        }
        else {                
            // No file
            System.out.println("Verify the file...");
        }
                
        System.out.println("Goodbye.");
    }  

    /**
     * Processes the arguments for the program
     * args[0] - path to file
     * 
     * @param args the argument array to get the path from
     * @return path to the file
     * 
     */
    public static String processArgs(String[] args){        
        String path;
        
        // Validate
        if(args.length != 1){
            // 
            // Invalid call to the program        
            System.out.println("Invalid arguments!"); 
            printUsage();
        
            path = null;            
        }
        else {
            //
            // pull the argument we will use for the path   
            path = args[0];

            //
            // Be sure we don't have an empty string
            if( path.equals("")){
            
                // Path was an empty string                            
                System.out.println("No path spcified!");                            
                path = null;
            }            
        }        
        // return the path
        return path;
    }

    /**
     * Gets a File object from the path specified
     * 
     * @param path the path of the file to create
     * @return File object loaded from the path
     * 
     */
    public static File getFile(String path){
        // 
        File file = null;

        try{

             //
            // we have a path, so check that its a file
            // - create an abstract file, then check that it exists
            file = new File(path);
                                
            if(!file.exists()){
                // Not a file
                System.out.println("The path: " + path + " is not a file!");
                
                file = null;
            }
        }
        catch(Exception error){
            //
            // File was not located
            System.out.println("An error occurred! Error: " + error.getMessage());
            file = null;
        }

        return file;
    }

    /**
     * Reads the file contents using a buffered readers. This provies
     * easire access to the full line, instead of processing individual characters
     * 
     * @param file the File object to read data from
     * @return Song[] array of songs
     * 
     */
    public static Song[] createSongsUsingBufferedReader(File file){
        // Default initialization
        Song[] songs = null;

        // Determine how may songs to make and initalize the array
        int count = getFileRowCount(file); 

        // Only proceed if we have rows of data
        if( count > 0 ){
            //
            // Initialize our array
            songs = new Song[count];

            // Create a file reader to read data from the file
            try(FileReader fr = new FileReader(file)){                 
                // Create a buffered reader to read data a line at a time
                try(BufferedReader reader = new BufferedReader(fr)){    
                    
                    int index = 0;
                    //
                    // while the stream is ready, read data
                    while(reader.ready()){
                        
                        // Get the line of data                    
                        String line = reader.readLine();
                                    
                        // create the song from the line (string)
                        Song song = createSong(line, ",");
                        
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
                //
                // Unable to load file
                System.out.println("Unable to get data from file! Error: " + error.getMessage());
            }     
        }
        
        return songs;
    }

    /**
     * Reads the file using a FileReader only
     * - requires breaking on line breaks, then on the values
     * 
     * @param file the File object to read data from
     * @return Song[] array of songs
     * 
     */
    public static Song[] createSongsUsingFileReader(File file){
        // Default initialization
        Song[] songs = null;

        // Determine how may songs to make and initalize the array
        int count = getFileRowCount(file); 

        //
        // Only proceeed if we have rows in the file
        if( count > 0 ){
            // Initialize our array
            songs = new Song[count];

            // Create a file reader to read data from the file
            try(FileReader reader = new FileReader(file)){                                 
                //
                // Local variables for processing the file data
                String line = new String();
                int index = 0;
                int character;                                
                
                //
                // Read the stream, processing a line at a time
                // - loop until the end of the file (-1)
                while((character = reader.read()) != -1){
                        
                    // Read the data from the stream up to the new line
                    if((char)character != '\n' && (char)character != '\r')
                    {   
                        // build the line of characters                          
                        line += (char)character;
                        continue;
                    }
                    else {
                        //
                        //  create a song from the line of text
                        songs[index] = createSong(line, ",");
                        line = "";
                        index++;                             
                    }                               
                }

                //  Add the last line of text
                songs[index] = createSong(line, ",");                
                
                // Close the reader
                reader.close();
            }
            catch(Exception error){
                //
                // Unable to read data from file
                System.out.println("Unable to read data from file! Error: " + error.getMessage());
                songs = null;
            }            
        }
            
        return songs;
    }

    /**
     * Gets the count of rows in the file
     * 
     * @param file the file to get row counts from
     * @return The count of rows in the file
     */
    public static int getFileRowCount(File file){
        int count = 0;

        // Create a file reader to read data from the file
        try(FileReader reader = new FileReader(file)){                                 
            //
            // the current character
            int character;                                
            
            // read from the stream until the end of file
            while((character = reader.read()) != -1){
                //
                // Keep looping until we get a new line
                if((char)character != '\n' && (char)character != '\r')
                {                       
                    continue;
                }
                else {
                    // Reached a new line;
                    count++;
                }                
            }

            // count the last line
            count++;
            
            //            
            // Close the reader
            reader.close();
        }
        catch(Exception error){
            //
            // Unable to read data from file
            System.out.println("Unable to read data from file! Error: " + error.getMessage());
            count = -1;
        } 
       
        return count;
    }

    /**
     * Creates a Song object from a string of data
     * - File format must be: title, artist, year
     * - year must be a valid integer 
     * 
     * @param line the string data for creating the song
     * @return Song instance 
     */
    public static Song createSong(String line, String seperator){
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

    /**
     * Prints the usage of the program to the output
     * 
     * @return void
     */
    public static void printUsage(){
        //
        // Prints the correct usage of the program        
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Arguments:");
        System.out.println("    - path | quoted path to file");
        System.out.println("");
        System.out.println("Usage:");
        System.out.println("");
        System.out.println("java robertsa.RobertsAssignment2 path");
    }
}
