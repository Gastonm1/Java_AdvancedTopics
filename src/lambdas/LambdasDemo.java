package lambdas;

// Functional Interface
import java.util.function.Function;
import java.util.function.Supplier;

// This interface represents a function or an operation that takes an argument and returns a value.
//

public class LambdasDemo {
    public static void show() {
    Function<String, Integer> map = str -> str.length();
    var length = map.apply("Sky");
        System.out.println(length);
    }
}
