package com.java.oops;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class to test polymorphism
class Main {
    public static void main(String[] args) {
        // Parent class reference, child class objects
        Animal a;
        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows

        a = new Cow();
        a.sound();  // Output: Cow moos
    }
}
