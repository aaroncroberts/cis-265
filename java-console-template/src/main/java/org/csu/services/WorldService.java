package org.csu.services;

/**
 * A World Class
 */
public class WorldService {
    
    /**
     * Constructs a new World object
     */
    public WorldService() {

    }
    
    /**
     * Returns a hello message from the World
     * @param message
     * @return
     */
    public String Hello(String message) {
        return String.format("Hello, %s!", message);
    }
}
