---
title: Selection Sort
categories: ['java', 'oop', 'code samples' ]
date: 2025-01-20
---

Selection Sort

````java
/*   
 * Name: SelectionSort
 * CSU ID: 
 * CIS 265: Review
 * Description: Sorts a selection 
 *
*/
import java.util.Scanner;

public class SelectionSort { 
    /**
     * Sorts the selection
     * 
     * @param list the list of doubles to sort
     */
    public static void selectionSort(double[] list){        
        // Loop on the list
        for(int i =0; i < list.length; i ++){
            
            // Find the minimum in the list
            double currentMin = list[i];
            int currentNumIndiex = 1;

            for(int j = i + 1; j < list.length; j++ ){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex]
            if( currentMinIndex != 1){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}


````