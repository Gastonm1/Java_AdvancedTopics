package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
        }


// There are times we want to declare multiple type parameters.
// Example: Implement a method for printing a key and value
// In this instance we need to declare a second type parameter
// By convention when we have two type parameters, they are called <K> and <V> (key and value)

    public static <K, V> void print(K key, V value){
        System.out.println(key + "=" + value);
    }
}

