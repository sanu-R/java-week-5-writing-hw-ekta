package homework;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java programme to iterate through all elements in an array list using Iterator.
 */

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Pineapple");
        fruitList.add("BANANA");
        fruitList.add("GRAPE");
        fruitList.add("GRAPE");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("BLACKBERRY");
        fruitList.add("CHERRY");
        fruitList.add("STRAWBERRY");
        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next()+ " ,");

        }


    }


}
