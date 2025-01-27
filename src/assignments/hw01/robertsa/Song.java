package robertsa;

/**
 * The Song class
 */
public class Song {    
    private String title;
    private String artist;    
    private int year;

    /**
     * Constructs a new Song object
     * - initalizes the Song with default values
     */
    public Song(){
        this("","",0);
    }

    /**
     * Constructs a new Song instance with some default values
     * 
     * @param title The title of the song
     * @param artist The artist of the song
     * @param year The year of the song
     */
    public Song(String title, String artist, int year){
        // Set our local members        
        this.title = title;
        this.artist = artist;
        this.year = year;        
    }  
    
    /**
     * Overrides the to string method for Object
     * 
     * @return String value with the title, artist, and year seperated by a comma ','
     * 
     */
    @Override
    public String toString(){
        return title + ", " + artist + ", " + year;
    }
}