---
title: Show Current Time
categories: [ 'sample-code', 'java', 'time' ]
date: 2025-01-20
---

````java
/*   
 * Name: ShowCurrentTime
 * CSU ID: 
 * CIS 265: Review
 * Description: Shows the current time calculated from current milliseconds
 *
*/
public class ShowCurrentTime {
    /**
     * Main entry point for program
     */
    public static void main(String[] args) {
        
        // Get milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        // the remainder dividing by 60 is the current second in this moment
        long ms = totalMilliseconds % 1000;
        long second = totalSeconds % 60;
        long minute = totalMinutes % 60;
        long hour = totalHours % 24;
        
        // Print the current time
        System.out.println("The current time is: " + hour + ":" + minute + ":" + second + ":" + ms + " GMT");
    }
}
````
