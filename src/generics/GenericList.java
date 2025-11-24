package generics;

// There are times you want to add a constraint or a restriction on a type parameter.
// Let's say you only want to store numbers in this list.
// To do that you need to extend Numbers
// Now, T can only be the Number class or any of its child classes.
// To know more about what is in the number class or its child subClasses, google: Java number class

// *Note* Also, the constraint doesn't HAVE to be a class. It can be an interface.
// For example there is a popular interface called Comparable.
// This interface is used for implementing classes that can be compared with each other.

// public class GenericList<T extends Comparable> {...}

// Which we could compare to something like our User class if we extend that constraint to also be comparable

// User.java
// public class User implements Comparable {...}

// *Note Also, we can add multiple interfaces as constraints.
// For example, we can add type Cloneable.
// Another popular interface in Java.
// If you want to be able to clone or copy a class, you should implement this interface in that class.

// public class GenericList<T extends Number & Cloneable> {...}

// IF YOU DO add multiple interfaces then know the ONLY way to use the list with the type is to make sure each class also has a cloneable interface.
// This is because T is now BOUND to the strictness of something that has a Number class (or subClass) AND cloneable.
// All parameters must be met in order to use the class. So it's a bound class.



public class GenericList<T extends Number> {
private T[] items = (T[]) new Object[10];
private int count;

public void add(T item) {
    items[count++] = item;
}

public T get(int index) {
    return items[index];
}

}
