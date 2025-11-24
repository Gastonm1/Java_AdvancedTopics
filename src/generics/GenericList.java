package generics;


// an Interator<T> is an iterator method (interator()) that returns an interator object.
// An iterator is an object that we use to iterate over an iterable.

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
private T[] items = (T[]) new Object[10];
private int count;

public void add(T item) {
    items[count++] = item;
}

public T get(int index) {
    return items[index];
}

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
