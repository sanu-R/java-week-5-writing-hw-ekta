package homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java programme to retrieve an element( at a specified index) form a given array list.
 */

public class Programme_6_RetrieveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("LEEK");
        vegetableList.add("POTATO");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("AUBERGINE");
        vegetableList.add("CABBAGE");
        vegetableList.add("TOMATO");
        vegetableList.add("SWEET POTATO");
        System.out.println(vegetableList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scanner.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("Invalid Index !");
        }
        scanner.close();


    }


}
