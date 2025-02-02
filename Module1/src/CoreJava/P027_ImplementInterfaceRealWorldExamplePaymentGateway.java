package CoreJava;


// Interface: PaymentMethod

interface PaymentMethod {
    void makePayment(double amount);
    void cancelPayment(double amount);
}


// Class: CreditCard (Implements PaymentMethod)

class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;

    public CreditCard(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Charging ₹" + amount + " to credit card " + cardNumber);
    }

    @Override
    public void cancelPayment(double amount) {
        System.out.println("Cancelling payment of ₹" + amount + " on credit card " + cardNumber);
    }
}


// Class: PayPal (Implements PaymentMethod)

class MikuPay implements PaymentMethod {
    private String email;

    public MikuPay(String email) {
        this.email = email;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Sending ₹" + amount + " via MikuPay to " + email);
    }

    @Override
    public void cancelPayment(double amount) {
        System.out.println("Cancelling MikuPay payment of ₹" + amount + " for " + email);
    }
}


// Main Class

public class P027_ImplementInterfaceRealWorldExamplePaymentGateway {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard("1234-5678-9012-3456", "12/2025");
        creditCard.makePayment(100.0);
        creditCard.cancelPayment(50.0);

        PaymentMethod mikupay = new MikuPay("mikunawada1208@gmail.com");
        System.out.println();
        mikupay.makePayment(200.0);
        mikupay.cancelPayment(75.0);
    }
}
