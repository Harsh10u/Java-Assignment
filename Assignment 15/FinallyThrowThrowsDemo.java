// FinallyThrowThrowsDemo.java
// Demonstrates exception handling using finally, throw, and throws

public class FinallyThrowThrowsDemo {

    // 'throws' keyword - declares that this method might throw a checked-like exception
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // 'throw' keyword - explicitly throwing an exception
            throw new IllegalArgumentException("Age must be 18 or above. Given: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        try {
            checkAge(15); // this will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            // 'finally' block - always executes, whether exception occurs or not
            System.out.println("Finally block: age check completed\n");
        }

        try {
            checkAge(21); // this will NOT throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block: age check completed");
        }
    }
}
