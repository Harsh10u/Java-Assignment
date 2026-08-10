// FinalKeywordDemo.java
// Demonstrates the use of 'final' with variables, methods, and classes

class Bank {
    final double interestRate = 5.5; // final variable - value cannot be changed

    final void showRate() { // final method - cannot be overridden by subclasses
        System.out.println("Interest rate is: " + interestRate + "%");
    }
}

// This class cannot be extended further because it is declared final
final class SavingsAccount extends Bank {
    void showAccountType() {
        System.out.println("This is a Savings Account");
    }
}

// The following would cause a compile-time error if uncommented,
// because SavingsAccount is a final class:
// class SuperSavingsAccount extends SavingsAccount { }

public class FinalKeywordDemo {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.showRate();          // final method, inherited and called normally
        account.showAccountType();

        // final local variable
        final int accountNumber = 101;
        System.out.println("Account Number: " + accountNumber);

        // accountNumber = 102; // This would cause a compile-time error since it's final
    }
}
