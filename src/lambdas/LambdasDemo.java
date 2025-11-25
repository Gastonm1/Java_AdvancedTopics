package lambdas;

public class LambdasDemo {
    public void print(String message){

    }

    public void show() {
//        greet(message -> System.out.println(message));
//        // rewrite the above with a method reference
//        greet(System.out::println);

        // Passing the parameter to an existing method aka Method Reference
        // Syntax
        // Class:Object::method();
//        greet(message -> print(message));
//        greet(LambdasDemo::print);
        // For an Instance
//        var demo = new LambdasDemo();
//        greet(message -> demo.print(message));
//        greet(demo::print);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
