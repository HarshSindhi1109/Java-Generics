package org.example;

import java.util.List;

class Vehicle {
    private int speed;
    public Vehicle(int speed) {
        this.speed = speed;
    }
    public String toString() {
        return "Vehicle {speed=" + speed + "}";
    }
}

public class Car extends Vehicle {
    private String model;
    public Car(int speed, String model) {
        super(speed);
        this.model = model;
    }
    public String toString() {
        return "Car {model=" + model + "} "+super.toString();
    }
    public static void display(List<? super Vehicle> lst) {
        for (Object obj : lst) {
            System.out.println(obj);
        }
    }
}
