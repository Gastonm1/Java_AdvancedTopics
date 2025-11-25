package lambdas;

// The Unary Operator Predicate Functions

// This is a functional interface and can therefore be used as the assignment target for a lambda expression or method interface.

import java.util.function.UnaryOperator;

public class LambdasDemo {
    public static void show() {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        // Get the square root of a number AND THEN increment by 1

        var result = increment.andThen(square).apply(1); // 4
        System.out.println(result);

    }
}
