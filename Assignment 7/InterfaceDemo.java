// InterfaceDemo.java
// Demonstrates Interfaces using a real-world example (Payment methods)

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface reference pointing to different implementing classes
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();

        payment1.pay(1500.00);
        payment2.pay(750.50);
    }
}
