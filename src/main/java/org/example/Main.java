package org.example;

import java.util.*;

class Data {
    private Object obj;
    public Data(Object obj) {
        this.obj = obj;
    }
    public String toString() {
        return obj.toString();
    }
    public Object getObj() {
        return obj;
    }
}

class Name {
    private String name;
    public Name(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Data> elements = new LinkedList<>();
        elements.add(new Data("Hydrogen"));
        elements.add(new Data("Oxygen"));
        elements.add(new Data("Nitrogen"));
        elements.add(new Data("Carbon"));
        elements.add(new Data(new Name("Boron")));

        String  x = new Data("Sodium").toString();
        System.out.println(x);
        System.out.println(elements);

        GenericData<String> genericData = new GenericData<>("Some random data");
        String str = genericData.getData();
        System.out.println(str);

        List<Data> lst = new LinkedList<>();
        lst.add(new Data("Adam"));
        lst.add(new Data("Eve"));

        for(Data d : lst) {
            System.out.println(d);
        }
    }
}