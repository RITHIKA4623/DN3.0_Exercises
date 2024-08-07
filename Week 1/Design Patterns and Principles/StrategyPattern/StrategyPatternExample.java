public class StrategyPatternExample {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Using Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(250.75);
        System.out.println();

        // Using PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password123");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(150.50);
    }
}
