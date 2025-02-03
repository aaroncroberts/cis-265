# Overview

This assignment requires loading a file with data, and creating songs represented by values in the file. The strucutre of the file is presumed to be fixed with properties of the song defined by a location within a single line of data.  Data on the line is seperated by a ',' comma, and each line followed the format:

````text
    artist, title, year
````

The year must be an integer.  

Example file: sample.txt

````text
    Yellow Submarine, The Beatles, 1969
````

Example program call:

````
    java robertsa.RobertsAssignment2 sample.txt
````

## Validation

Basic validation is handled by the program.  The following conditions are handled, with specififed test files included in the project.

1. No file path argument
2. Invalid file path argument
3. No file found for path
4. File is empty
5. File does not contain data that is usable
6. Row does not have data
7. Row has more than 3 values of data, seperated by a comma
8. Row has an invalid integer for Year
9. Some rows are bad, while others are good.  Good rows will be processed

**Test Files**

Files used for testsing are part of the respository:

* [blank data](/robertsa/songs-invalid-blank-data.txt)
* [invavlid columns](/robertsa/songs-invalid-columns.txt)
* [invalid content](/robertsa/songs-invalid-content.txt)
* [invalid no row data](/robertsa/songs-invalid-nodata.txt)
* [invalid year](/robertsa/songs-invalid-year.txt)
* [mixed data](/robertsa/songs-mixed.txt)
* [correct file](/robertsa/songs.txt)

## Running the Program

To build the project, run the `build.sh` script in the root.

````bash
    . build.sh
````

Check usage of the program, execute without arguments

````bash
    java robertsa.RobertsAssignment2

    --------------------------------------------------
        Arguments:
            - path | quoted path to file

        Usage:  java robertsa.RobertsAssignment2 path

    No path provided!
    Verify the file...
    Goodbye.
````

To run the program, execute the `java` command from the root, after compiling:

````bash
    java robertsa.RobertsAssignment2 songs.txt
    Creating 5 songs...
    Found 5 songs!
    Bad Blood, Taylor Swift, 2014
    White Rabbit, Jefferson Airplane, 1967
    Tiny Dancer, Elton John, 1993
    Rollin’ Stone, Muddy Waters, 1948
    In Da Club, 50 Cent, 2008
    Goodbye.
````
## FileReader and BufferedReader

Two implementations were explored: `createSongsFromFileReader` and `createSongsFromBufferedReader`, using `FileReader` and `BufferedReader` respectively. The BufferedReaer has the advantage of allowing the caller to use `readLine()`, where `FileReader` requires parsing each character until reaching a line ending '\n' or '\r'.

**FileReader:**

````java 
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
        Song[] songs = new Song[0];
        int index = 0;

        // Determine how may songs to make and initalize the array
        int count = getFileRowCount(file); 
        
        // if we have rows, try to create songs
        if( count < 1 ){
            // Nothing to do here
            System.out.println("There was nothing in the file!");            
        }
        else {
            // Let the user know what was found
            System.out.println("Creating " + count + " songs...");   

            // Create our array of songs
            songs = new Song[count];

            // Create a file reader to read data from the file
            try(FileReader reader = new FileReader(file)){                                 
                // Local variables for processing the file data
                String line = new String();                
                int character;                                
                
                // Read the stream, processing a line at a time
                while((character = reader.read()) != -1){
                        
                    // Read the data from the stream up to the new line
                    if((char)character != '\n' && (char)character != '\r')
                    {   
                        // build the line of characters                          
                        line += (char)character;
                        continue;
                    }
                    else {
                        //  create a song from the line of text
                        Song song =  createSong(line, ",");
                        line = "";

                        // Only add valid songs
                        if(song != null){
                            songs[index] = song;
                            index++;                
                        }                        
                    }                               
                }

                //  Add the last line of text
                Song song =  createSong(line, ",");                
                if(song != null){
                    songs[index] = song;
                    index++;
                } 
                                                                
                // Close the reader
                reader.close();
            }
            catch(Exception error){
                //
                // Unable to read data from file
                System.out.println("Unable to read data from file! Error: " + error.getMessage());
                songs = new Song[0];
            }            
        }

        // Correct the array size
        Song[] results = resize(songs, index, true);
                   
        return results;
    }
````


**BuferedReader:**

````java 
    /**
     * Reads the file contents using a buffered reader. 
     * This provies easire access to the full line instead 
     * of processing individual characters
     * 
     * @param file the File object to read data from
     * @return Song[] array of songs
     * 
     */
    public static Song[] createSongsUsingBufferedReader(File file){
        // Default initialization
        Song[] songs = new Song[0];
        int index = 0;

        // Determine how may songs to make and initalize the array
        int count = getFileRowCount(file); 
        
        // if we have rows, try to create songs
        if( count < 1 ){
            // Nothing to do here
            System.out.println("There was nothing in the file!");            
        }
        else {
            // Let the user know what was found
            System.out.println("Creating " + count + " songs...");   

            // Initialize our array
            songs = new Song[count];

            // Create a file reader to read data from the file
            try(FileReader fr = new FileReader(file)){                 
                // Create a buffered reader to read data a line at a time
                try(BufferedReader reader = new BufferedReader(fr)){    
                                        
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

                    // Close our reader
                    reader.close();
                }
            }
            catch(Exception error) {           
                //
                // Unable to load file
                System.out.println("Unable to get data from file! Error: " + error.getMessage());
                songs = new Song[0];
            }     
        }

        // Correct the array size
        Song[] results = resize(songs, index, true); 
                                           
        return results;
    }
````

I've submitted both and used the `createSongsFromFileReader` in main.

## Reuse and Testability

The program was modularized to make testing more straight forward, and to allow encapsulation of validation. The methods deal with validation, exception handling, and writing errors to the standard out stream. 

**Methods:**

````java
    /**
     * Creates a Song object from the string line, using the seperator 
     */
    public static Song createSong(String line, String seperator){}
    /**
     * Gets a file from the specified path
     */
    public static File getFile(String path){}
    /**
     * Counts the rows in the file
     */
    public static int getFileRowCount(File file){}
    /**
     * Gets a year from the string
     */
    public static int getYear(String year, int max){}
    /**
     * Prints the usage statement for the program
     */
    public static void printUsage(){}
    /**
     * Processes the program event args to get the path
     */
    public static String processArgs(String[] args){}
````