package com.java.oops;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
    }
}
