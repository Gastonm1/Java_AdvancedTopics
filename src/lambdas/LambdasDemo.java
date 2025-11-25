package lambdas;

// The Combining Predicate Functions


import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
    Predicate<String> hasLeftBrace = str -> str.contains("{");
    Predicate<String> hasRightBrace = str -> str.endsWith("}");

        // and = &&
        // || = or
        // ! = negate
//    Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//    var result = hasLeftAndRightBraces.test("{key:value}"); // true
//      var result hasLeftBrace = hasLeftBrace.or(hasRightBrace); // true;
//      hasLeftBrace.negate(); // returns the opposite of the first predicate
//      ystem.out.println(result);
    }
}
