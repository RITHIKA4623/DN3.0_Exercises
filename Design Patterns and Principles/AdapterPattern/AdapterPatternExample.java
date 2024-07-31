public class AdapterPatternExample {

    public static void main(String[] args) {
        // Create instances of third-party payment gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Use the adapters to process payments
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}
