import lambdas.LambdasDemo;

import java.util.ArrayList;
import java.util.List;

// The consumer interface represents and operation that takes a single argument and doesn't return a value
// Variations of this interface is BiConsumer (T, I)
// Variation of this interface is IntConsumer(int value)
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);

        // Imperative Programming (for, if/else, switch/case)
        // Implementing logic using instructions
        for(var item : list) {
            System.out.println(item);
        }
        //Declarative Programming
        // Instead of saying HOW something should be done, we specify WHAT needs to be done
        list.forEach(item -> System.out.println(item));
    }
}