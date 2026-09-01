// UserDefinedExceptionDemo.java
// Demonstrates creating and handling a user-defined (custom) exception

// Custom exception class, extending the built-in Exception class
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // throwing our custom exception
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance + ", Requested: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            account.withdraw(500.0);  // valid withdrawal
            account.withdraw(800.0);  // invalid, triggers custom exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished");
        }
    }
}
