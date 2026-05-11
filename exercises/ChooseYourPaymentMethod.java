import java.util.Scanner; 

// Common interface for payment methods 
interface PaymentMethod { 
    void processPayment(double amount); 
}

class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class BitcoinPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        int choice = scanner.nextInt();
        double amount = scanner.nextDouble();

        PaymentMethod paymentMethod;

        if (choice == 1) {
            paymentMethod = new CreditCardPayment();
        } 
        else if (choice == 2) {
            paymentMethod = new PayPalPayment();
        } 
        else {
            paymentMethod = new BitcoinPayment();
        }

        paymentMethod.processPayment(amount);
        
        scanner.close(); 
    }
}