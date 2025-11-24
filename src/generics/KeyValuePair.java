package generics;

// We can also declare a class with multiple type parameters.

public class KeyValuePair<K,V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }
}
