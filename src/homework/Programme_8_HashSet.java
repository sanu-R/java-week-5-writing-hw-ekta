package homework;

import java.util.HashSet;

/**
 * Use  a HashSet stores Integer objects. Store the number 4, 7 and 8 to Sets.
 * show which are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */

public class Programme_8_HashSet {
    public static void main(String[] args) {
        //Create a HashSet object called numbers
        HashSet<Integer> number = new HashSet<>();
        //Add value to the set
        number.add(4);
        number.add(7);
        number.add(8);
//Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " is found in the set.");
            } else {
                System.out.println(i + " is not found in the set.");
            }
        }


    }


}
