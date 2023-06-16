package homework;
/** Write a Java programme to reverse an array of integer values.
 */

import java.util.Arrays;

public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 34, 54, 76, 78};//single dimension array
        System.out.println("Original array: " + Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        System.out.print("Reverse array :");
        obj.reverseAnArray(array);

    }

    //method to reverse an array
    public void reverseAnArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(list));
    }
}