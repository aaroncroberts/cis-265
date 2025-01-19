---
title: Chinese Zodiac
categories: [ 'sample-code', 'java', 'logic' ]
---

````java
/*   
 * Name: ChineseZodiac
 * CSU ID: 
 * CIS 265: Review
 * Description: Determines the Zodiac for the year
 *
*/

import java.util.Scanner;

public class ChineseZodiac {
    /*
     * Main entry point for the program 
     */
    public static void main(String[] args){
        //
        // Create a scanner to read the input stream
        try(Scanner input = new Scanner(System.in))
        {
            // Collect a year
            System.out.println("Enter a year [eg. 2024]: ");
            int year = nextInt();
            
            //
            // Determine the zodiac sign
            switch(year % 12)
            {
                case 0 : {
                    System.out.pringln("monkey");
                    break;
                }
                case 1 : { 
                    System.out.pringln("rooster");
                    break;
                }
                case 2 : {
                    System.out.pringln("dog");
                    break;
                }
                case 3 : {
                    System.out.pringln("pig");
                    break;
                }
                case 4 : {
                    System.out.pringln("rat");
                    break;
                }
                case 5 : {
                    System.out.pringln("ox");
                    break;
                }
                case 6 : {
                    System.out.pringln("tiger");
                    break;
                }
                case 7 : {
                    System.out.pringln("rabbit");
                    break;
                }
                case 8 : {
                    System.out.pringln("dragon");
                    break;
                }
                case 9 : {
                    System.out.pringln("snake");
                    break;
                }
                case 10 : {
                    System.out.pringln("horse");
                    break;
                }
                case 11 : {
                    System.out.pringln("sheep");
                    break;
                }
            }
        }
    }      
}
````
