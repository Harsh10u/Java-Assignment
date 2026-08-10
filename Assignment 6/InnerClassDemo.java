// InnerClassDemo.java
// Demonstrates the use of a Non-Static Inner Class in Java

class Outer {
    private String message = "Hello from Outer class";

    // Inner class defined inside the Outer class
    class Inner {
        void display() {
            // Inner class can directly access private members of Outer class
            System.out.println("Message from Outer: " + message);
            System.out.println("This is the display() method of Inner class");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // Step 1: Create an object of the Outer class
        Outer outer = new Outer();

        // Step 2: Create an object of the Inner class using the Outer object
        Outer.Inner inner = outer.new Inner();

        // Step 3: Call the method of Inner class
        inner.display();
    }
}
