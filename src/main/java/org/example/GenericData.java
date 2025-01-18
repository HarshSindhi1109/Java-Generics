package org.example;

public class GenericData<T> {
    private T data;
    public GenericData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
