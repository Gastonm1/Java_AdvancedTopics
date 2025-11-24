package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        // The ArrayList in Java is resizeable (or dynamic) array from the java.util package.
        // It can grow or shrink automatically as elements are added or removed
        Collection<String> collection = new ArrayList<>();
        // addAll() is a method on the ArrayList class used to add all the elements from a specified collection into an ArrayList
        // This method is especially useful for combining collections or inserting multiple elements at once.
        // In the example below the goal is to have an array with string [a,b,c].
        // You get the same result as collections.add("a"), collections("b), collections("c")
        // [a,b,c]
        Collections.addAll(collection, "a", "b", "c");

        // Another useful method from the ArrayList class is the .size() method
        // Which returns the number of items within the collection
        System.out.println(collection.size());

        // There is also a method for removing an object from a collection with .remove() method
//        System.out.println(collection.remove("a"));

        // Another method to remove all items/objects from a collection is the .clear() method
//        collection.clear();

//        // Check for existence of an item, use .contains() method.
//        var containsA = collection.contains("a");
//        System.out.println(containsA);

        // You can make a collection a regular array by calling .toArray() method
//        var objectArray = collection.toArray();

        // checking for equality use the .equals() method
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection.equals(other));


            System.out.println(collection);

    }
}
