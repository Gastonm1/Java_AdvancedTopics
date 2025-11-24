import exceptions.ExceptionsDemo;
import generics.GenericList;

public class Main {
    public static void main(String[] args) {
//        When creating an instance of a generic type, we can only use a reference type as a generic type argument
//        // Example we can pass the User class (<User>) as a generic type argument, because this class is a reference type
//        We can also use the Object (<Object>) or String (<String>) class. These are all reference types in Java
//        We can not pass the primitive types (integer, boolean, float)
//        If you want to use these values inside a generic list, we have to use the wrapper class.
//        int -> Integer
//        float -> Float
//        boolean -> Boolean
//
        GenericList<Integer> numbers = new GenericList<>();
        // For example the signature of the .add() method, takes an instance of the integer class.
        // The Java compiler will automatically wrap this value inside an instance of the integer class.
        // So it's going to create an instance of the class to store this value.
        // This is called Boxing.

        numbers.add(1); // Boxing

        // If we call the .get() method, you can see in the return type that it is an instance of the Integer class.
        // So if you get the first item and store in a primitive in, you see the Java compiler is going to extract the value that is stored in that integer object.
        // That is called Unboxing

        int number = numbers.get(0); // Unboxing

        // This is how we create generic types that work with primitive values
    }
}