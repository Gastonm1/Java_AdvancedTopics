package exceptions;

public class ExceptionsDemo {
    public static void show() {
        // In Java there are three types of Exceptions
        // Checked Exceptions, Unchecked (runtime) Exceptions, Errors
        // Types of Runtime Exceptions include: NullPointerException, ArithmeticException, IllegalArgumentException, IndexOutOfBoundsException, IllegalStateException
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
