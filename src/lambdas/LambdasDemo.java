package lambdas;

// The Predicate Interface
// This is a functional interface and can therefore be used as the assignment
// target for a lambda expression or method reference.

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
    Predicate<String> isLongerThan5 = str -> str.length() > 5;
    var result = isLongerThan5.test("sky");
    System.out.println(result);

    }
}
