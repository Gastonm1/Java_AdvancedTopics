package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");

        // You from the list class, you can use the .add() method to add an item at a specific point.
        // Here we are adding an "!" at the beginning.
//        list.add(0, "!");
//        System.out.println(list);

        // get the first indexed item by using the .get() method
//        System.out.println(list.get(0));

        // There is also a method to replace an object at a given index with the .set() method.
//        list.set(0, "a+");
//        System.out.println(list);


        // You can also remove an object by its index with the .remove() method.
//        list.remove(0);
//        System.out.println(list);

        // You can also return the index of the first occurrence of whatever you want with .indexOf() method.
        // In this case lets return the first occurrence of a
        // If the value or object does not exist, it will return -1
//        System.out.println(list.indexOf("a"));  // 0

        // For the last occurrence of an object you use, the lastIndexOf() method.
//        System.out.println(list.lastIndexOf("a"));

        //The .subList() method returns a new list (referred to as a sublist) which contains the items of the list between two indices.
        System.out.println(list.subList(0, 2)); // [a,b]
    }
}
