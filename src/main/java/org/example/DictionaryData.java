package org.example;

public class DictionaryData<K extends Integer, V> {
    private K key;
    private V value;

    public DictionaryData(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public String toString() {
        return "Data{" + "key= " + key + ", value= " + value + "}";
    }

    public <N extends Number, E> void display(N number, E element) {
        System.out.println("Number: "+number + " Element: "+element);
    }
}
