interface PaymentGateway {
    void processPayment(double amount, String currency);
}