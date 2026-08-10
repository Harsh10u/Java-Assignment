// AnonymousClassDemo.java
// Demonstrates the use of an Anonymous Class in Java

// Interface used to create the anonymous class
interface Greeting {
    void greet();
}

// Abstract class used to create another anonymous class
abstract class Shape {
    abstract void area();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {

        // Example 1: Anonymous class implementing an interface
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello! This is an anonymous class implementing an interface.");
            }
        };
        greeting.greet();

        // Example 2: Anonymous class extending an abstract class
        Shape circle = new Shape() {
            double radius = 5.0;

            @Override
            void area() {
                double result = Math.PI * radius * radius;
                System.out.println("Area of circle (anonymous class): " + result);
            }
        };
        circle.area();

        // Example 3: Anonymous class using Runnable (common in event handling / threads)
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class implementing Runnable is running.");
            }
        };
        task.run();
    }
}
