interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPal {
    void pay(double amount) {
        System.out.println("Paid :" + amount + " using PayPal");
    }
}

class UPI {
    void sendMoney(double amount) {
        System.out.println("Transferred :" + amount + " using UPI");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal = new PayPal();

    public void processPayment(double amount) {
        paypal.pay(amount);
    }
}

class UPIAdapter implements PaymentProcessor {
    private UPI upi = new UPI();

    public void processPayment(double amount) {
        upi.sendMoney(amount);
    }
}


public class AdapterPatternExample {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(569.0);

        PaymentProcessor upi = new UPIAdapter();
        upi.processPayment(1399.0);
    }
}
