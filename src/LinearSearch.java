/*   
 * Name: LinearSearch
 * CSU ID: 
 * CIS 265: Review
 * Description: Implements a linear search pattern
 *
*/
public class LinearSearch {
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
        for(int i = 0; i < items.length; i++) {
            if(key == items[i]){
                
                return i;
            }
        }
        // nothing found
        return -1;
    }
}
