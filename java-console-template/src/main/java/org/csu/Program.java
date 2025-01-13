package org.csu;

import org.csu.services.WorldService;
/**
 * Program file for Java Console
 */
public class Program {

    public static void main(String[] args) {

        //
        // Create one of our objects and interact with it
        WorldService world = new WorldService();
        String message = world.Hello("User");

        //
        // Print a message to the console
        System.out.println(message);
    }    
}