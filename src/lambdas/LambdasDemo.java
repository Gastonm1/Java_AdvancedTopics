package lambdas;

import java.util.List;
import java.util.function.Consumer;

// Chain Consumers
// We can run multiple operations IN sequence
public class LambdasDemo {
    public static void show() {
        List<String> list = List.of("a","b","c");
        Consumer<String> print = (String item) -> System.out.println(item);
        Consumer<String> printUpperCase = (String item) -> System.out.println(item.toUpperCase());

        // Here we can show the Print and then print UpperCase using the andThen() method.
        list.forEach(print.andThen(printUpperCase).andThen(print));
    }
}
