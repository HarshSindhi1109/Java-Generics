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

        List<GenericData<Object>> lst = new LinkedList<>();
        lst.add(new GenericData<>("Adam"));
        lst.add(new GenericData<>("Eve"));
        lst.add(new GenericData<>(5.25));
        lst.add(new GenericData<>(18));

        for(GenericData<Object> d : lst) {
            System.out.println(d.getData());
        }

        DictionaryData<Integer, String> data = new DictionaryData<>(4, "Death");
        System.out.println(data.toString());

        String[] stringArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        new PrintArrayData().printArray(stringArray);

        Integer[] intArray = {101, 102, 103, 104, 105};
        new PrintArrayData().printArray(intArray);

        data.display(625.526f, "dollar");

        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(40));
        list.add(new Vehicle(60));
        list.add(new Vehicle(50));
        list.add(new Car(120, "S40"));

        Car.display(list);
    }
}