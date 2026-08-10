// AbstractClassDemo.java
// Demonstrates the use of Abstract Classes and Abstract Methods in Java

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    // abstract method - no body, must be implemented by subclasses
    abstract double calculateArea();

    // regular (concrete) method - can be used as-is by subclasses
    void displayName() {
        System.out.println("Shape: " + name);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Shape shape = new Shape("Generic"); // Error: cannot instantiate an abstract class

        Shape rectangle = new Rectangle(5.0, 3.0);
        rectangle.displayName();
        System.out.println("Area: " + rectangle.calculateArea());

        Shape circle = new Circle(4.0);
        circle.displayName();
        System.out.println("Area: " + circle.calculateArea());
    }
}
