---
title: Count Letters In Array
categories: ['java', 'oop', 'code samples' ]
date: 2025-01-20
---

Generates random characters and counts letters in an array

````java

/*   
 * Name: CountLettersInArray
 * CSU ID: 
 * CIS 265: Review
 * Description: Counts the occurance of letters in an array
 *
*/
import java.util.Scanner;

public class CountLettersInArray {

    /**
     * Main entry point for the program
     * 
     * @param args arguments for the program
     */    
    public static void main(String[] args){

        char[] characters = createArray(100);

        //
        //  Print our letters
        System.out.println("The letters are: ");
        displayArray(characters);

        // Get the counts
        int[] counts = countLetters(characters);

        //
        // Display the counts
        System.out.println();
        System.out.println("The occurance of each letters are: ");
        displayCounts(counts);

    }
    /**
     * Creates an array with random characters
     * 
     * @param size the size of the array to create
     * 
     * @return an array with random characters
     */
    public static char[] createArray(int size){
        char[] array = new char[size];

        //
        // Fill the array with random characters
        for(int i = 0; i < array.length; i++){
            array[i] = RandomCharacter.getRandomCharacterLowerCase();
        }
        
        return array;
    }

    /**
     * Counts the occurance of lower case letters
     * 
     * @param chars the array of characters to count
     * @return int[] of counts for occurance of lower letters
     */
    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];

        for( int i = 0; i < chars.length; i++){
            counts[chars[i] - 'a']++;
        }

        return counts;
    }
    /**
     * Displays the array of characters
     * 
     * @param chars the characters to display 
     */
    public static void displayArray(char[] chars){
        for(int i = 0; i < chars.length; i++){

            if((i + 1) % 20 == 0){
                System.out.println(chars[i]);
            }
            else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    /**
     * Displays the counts of characters in the array
     * 
     * @param counts the counts to display for characters
     */
    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){

            if((i + 1) % 10 == 0){
                System.out.println(counts[i] + " " + (char)( i +  'a'));
            }
            else {
                System.out.print(counts[i] + " " + (char)( i +  'a') + " ");
            }
        }
    }
}
````