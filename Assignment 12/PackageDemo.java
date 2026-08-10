// PackageDemo.java
// Demonstrates the use of a user-defined package ('mypackage')
//
// FOLDER STRUCTURE REQUIRED:
// Assignment 12/
//   ├── PackageDemo.java
//   └── mypackage/
//         └── Calculator.java
//
// HOW TO COMPILE AND RUN (from inside the "Assignment 12" folder):
//   javac mypackage/Calculator.java
//   javac PackageDemo.java
//   java PackageDemo

import mypackage.Calculator; // importing the user-defined package's class

public class PackageDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
    }
}
