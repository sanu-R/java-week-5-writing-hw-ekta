package homework;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Blue");
        c1.add("White");
        c1.add("Black");
        c1.add("Yellow");
        c1.add("Red");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Pink");
        c2.add("Yellow");
        c2.add("Blue");
        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

    }


}
