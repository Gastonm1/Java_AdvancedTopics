package collections;

import java.util.*;

// This interface represents a collection that contains NO duplicates
// So it's a great way for storing a list of unique values

public class SetDemo {
    public static void show() {
        // HashSet is one of the implementations of the set interface that you use 90% of the time.
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);


        // We can use a set to remove duplicates
//        Collection<String> collection = new ArrayList<>();
//            Collections.addAll(collection, "a", "b", "c", "c");
//            Set<String> set = new HashSet<>(collection);
//            System.out.println(set);

        // Set Operations
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union Operation
//        set1.addAll(set2);
//        System.out.println(set1);

        // Intersection Operation
//        // Items that are common in both sets
//        set1.retainAll(set2);
//        System.out.println(set1);

        // Difference Operation
        set1.removeAll(set2);
        System.out.println(set1);




    }
}
