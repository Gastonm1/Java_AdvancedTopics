package streams;

// There are a few ways to create a stream
// From a collection, array, arbitrary number of objects, infinite/finite streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        // Collection
//        Collection<Integer> x;
//        x.stream();

        // Array List
//        var list = new ArrayList<>();
//        list.stream();

//        // Integer Array
//        int[] numbers = {1,2,3,4,5};
//        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        // Arbitrary number of objects
//        Stream.of(1,2,3,4);
//        var stream = Stream.generate(() -> Math.random());
//        stream.limit(4).forEach(System.out::println);

        // Generate infinite or final streams
        // The .iterate() method has two parameters
        // Seed, or initial value
        // Unary operator that would modify this value
        // Unary operator is a function that takes a value and returns a new value.
        Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);

    }
}
