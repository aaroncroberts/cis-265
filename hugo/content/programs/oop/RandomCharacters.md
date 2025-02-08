---
title: Random Characters
categories: ['guides', 'java', 'oop' ]
date: 2025-01-20
---

Prints random characters

````java
/*   
 * Name: RandomCharacter
 * CSU ID: 
 * CIS 265: Review
 * Description: Gets random characters
 *
*/
import java.util.Scanner;

public class RandomCharacter {

    /*
     * Main entry point for the program 
     * 
     * @param args arguments for the program
     */
    public static void main(String[] args){
        // Max Characters per line to print
        final int CHARACTERS_PER_LINE = 25;

        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            int characters = 0;

            // Get the input for character count
            do{                     
                System.out.println("Enter a number of characters to print: [eg. 1 - 100]");
                
                try{                    
                    characters = input.nextInt();                
                }       
                catch(Exception error) {
                    characters = -1;
                    input.nextLine();  
                }                
            }
            while(characters <=0 || characters > 100);

            //
            // Print our characters
            // - upper
            System.out.println();
            System.out.println("----- UPPER ------");
            for(int i = 1; i < characters + 1; i++ ){
                char c = getRandomCharacterUpperCase();

                //
                // Print a line ending if we are at our max, otherwise, print the character  
                if( i % CHARACTERS_PER_LINE == 0){
                    System.out.println(c);
                }
                else {
                    System.out.print(c);
                }                
            }
            System.out.println();

            // - Lower
            System.out.println();
            System.out.println("----- LOWER ------");
            for(int i = 1; i < characters + 1; i++ ){
                char c = getRandomCharacterLowerCase();

                //
                // Print a line ending if we are at our max, otherwise, print the character  
                if( i % CHARACTERS_PER_LINE == 0){
                    System.out.println(c);
                }
                else {
                    System.out.print(c);
                }                
            }
            System.out.println();

            // - Digit
            System.out.println();
            System.out.println("----- DIGIT ------");
            for(int i = 1; i < characters + 1; i++ ){
                char c = getRandomCharacterDigit();

                //
                // Print a line ending if we are at our max, otherwise, print the character  
                if( i % CHARACTERS_PER_LINE == 0){
                    System.out.println(c);
                }
                else {
                    System.out.print(c);
                }                
            }
            System.out.println();

            // - Unicode
            System.out.println();
            System.out.println("----- UNICODE ------");
            for(int i = 1; i < characters + 1; i++ ){
                char c = getRandomCharacter();

                //
                // Print a line ending if we are at our max, otherwise, print the character  
                if( i % CHARACTERS_PER_LINE == 0){
                    System.out.println(c);
                }
                else {
                    System.out.print(c);
                }                
            }
            System.out.println();
    
        }

        System.out.println(":: end-of-program ::");
    }
    /**
     * Gets a random character between the first and second character
     */
    public static char getRandomCharacter(char ch1, char ch2){
        return( (char)(ch1 + Math.random() * (ch2 - ch1 + 1)));
    }
    /**
     * Gets a random lower case character
     * 
     * @return a character between a - z
     */
    public static char getRandomCharacterLowerCase(){
        return getRandomCharacter('a', 'z');
    }
    /**
     * Gets a random upper case character between A - Z
     * 
     * @return a character between A - Z
     */
    public static char getRandomCharacterUpperCase(){
        return getRandomCharacter('A', 'Z');
    }
    /**
     * Gets a random character between 0 adn 9
     * 
     * @return a character between 0 - 9
     */
    public static char getRandomCharacterDigit(){
        return getRandomCharacter('0','9');
    }
    /**
     * Gets a random unicode character
     * 
     * @return a character in the unicode set between \u0000 abnd \uFFFF
     */
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000', '\uFFFF');        
    }
}
````