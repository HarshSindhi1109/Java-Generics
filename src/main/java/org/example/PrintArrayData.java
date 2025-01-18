package org.example;

public class PrintArrayData {
    public <E> void printArray(E[] array) {
        for(E element : array) {
            System.out.println(element);
        }
    }
}
