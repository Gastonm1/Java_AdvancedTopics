package lambdas;

// Supplier Interface
import java.util.function.Supplier;

// This is the opposite of the consumer interface.
// So instead of consuming a value, it supplies a value

public class LambdasDemo {
    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }
}
