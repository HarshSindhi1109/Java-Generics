package org.example;

public class DictionaryData<K, V> {
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
}
