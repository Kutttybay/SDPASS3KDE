class CardPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Платеж в размере " + amount + " " + currency + " успешно обработан.");
    }
}