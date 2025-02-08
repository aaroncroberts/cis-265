---
title: Binary Search
categories: [ 'java', 'arrays','code samples' ]
date: 2025-01-20
---

Binary search implementation

````java
/*   
 * Name: BinarySearch
 * CSU ID: 
 * CIS 265: Review
 * Description: Implements a binary search
 *
*/
public class BinarySearch {
    public static void main(String[] args){
        int[] items = { 1,2,3,4,5,7,8,9,10,23 };

        // Locate the item in the list
        int index = search(items, 4);

        System.out.println("Located item [" + 4 + "] : " + index);

        System.out.println(":: end-of-program ::");
    }

    /**
     * linearSearch that locates the index of the item in the array
     */
    public static int search(int[] items, int key){        
        // set the edges 
        int low = 0;
        int high = items.length - 1;

        while( high >= low ){
            int mid = (low + high) / 2;

            if(key < items[mid]){
                // adjust the midpoint
                high = mid - 1;
            }
            else if( key == items[mid]) {
                return mid;
            }
            else{
                low = mid + 1;
            }
        }
        
        // nothing found, return -k -1 for index location 
        // where the item should go
        return -low - 1;
    }
}

````
