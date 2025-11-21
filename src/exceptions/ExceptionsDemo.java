package exceptions;

public class ExceptionsDemo {
    public static void show() {
        // This will cause a common exception called NullPointerException.
        // An exception is an object that contains information about an error.
        // In this case, this object is an instance of the NullPointerException class

        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
