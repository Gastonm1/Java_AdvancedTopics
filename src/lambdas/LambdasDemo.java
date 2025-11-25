package lambdas;

// What is a Lambda Expression?
// Lambda expression is an anonymous function that we can pass around
// A function that exists on its own without belonging to a class

public class LambdasDemo {
    public static void show() {
//    greet(new Printer() {
//        @Override
//        public void print(String message) {
//            System.out.println(message);
//        }
//    });

    // rewriting the above as a lambda expression
        greet((message) -> {
            System.out.println(message);
        });
        // You can also store lamba expressions in a variable
        Printer printer = message -> System.out.println(message);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
