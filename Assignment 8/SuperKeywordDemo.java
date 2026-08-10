// SuperKeywordDemo.java
// Demonstrates the use of the 'super' keyword in Java

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // 1. calls the parent class constructor
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        super.sound(); // 2. calls the parent class method
        System.out.println("Dog barks");
    }

    void printNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name); // 3. accesses parent class field
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.printNames();
    }
}
