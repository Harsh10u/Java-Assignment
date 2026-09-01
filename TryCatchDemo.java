// TryCatchDemo.java
// Demonstrates exception handling using try-catch, nested try, and multiple catch blocks

public class TryCatchDemo {
    public static void main(String[] args) {

        // ---------- Example 1: Multiple catch blocks ----------
        int[] numbers = {10, 20, 30};
        try {
            System.out.println("Result: " + (numbers[1] / 0)); // ArithmeticException
            System.out.println(numbers[5]);                    // would throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } finally {
            System.out.println("Multiple catch example finished\n");
        }

        // ---------- Example 2: Nested try-catch ----------
        try {
            System.out.println("Outer try block started");

            try {
                int result = 50 / 0; // inner exception
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }

            String str = null;
            System.out.println(str.length()); // NullPointerException, caught by outer catch

        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            System.out.println("Nested try-catch example finished");
        }
    }
}
