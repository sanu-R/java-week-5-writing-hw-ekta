package homework;
/**
 * Write a Java programme to create a new array list and add some colours (string) and printout the collection using
 * for each loop.
 */

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("GREEN");
        colourList.add("BLACK");
        colourList.add("RED");
        colourList.add("YELLOW");
        colourList.add("BLUE");
        colourList.add("CYAN");
        colourList.add("WHITE");
        colourList.add("PURPLE");
        colourList.add("ORANGE");
        for (String colorList : colourList) {
            System.out.println(colorList + " ,");
        }


    }
}
