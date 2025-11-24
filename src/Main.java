import exceptions.ExceptionsDemo;
import generics.GenericList;

public class Main {
    public static void main(String[] args) {
    // So with the new Number constrain on GenericList.java
    // If you make a new list of <string> you'll get a compilation error. You can only pass Number or any of its subclasses.
//        new GenericList<String>(); // <-- Compilation error

        new GenericList<Number>();
    }
}