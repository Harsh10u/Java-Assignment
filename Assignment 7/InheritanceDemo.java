// InheritanceDemo.java
// Demonstrates Inheritance using a real-world example (Vehicle -> Car)

class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
}

// Car inherits properties and behavior from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int wheels, int numberOfDoors) {
        super(brand, wheels); // calling parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    void honk() {
        System.out.println(brand + " is honking: Beep! Beep!");
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // reuse parent class method
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4, 4);
        car.start();       // inherited method
        car.honk();         // Car's own method
        car.displayInfo();  // overridden method
    }
}
