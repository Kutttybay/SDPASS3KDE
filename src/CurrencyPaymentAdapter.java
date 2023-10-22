class CurrencyPaymentAdapter implements PaymentGateway {
    private final PaymentGateway originalPaymentGateway;
    private final CurrencyConverter currencyConverter;

    public CurrencyPaymentAdapter(PaymentGateway originalPaymentGateway, CurrencyConverter currencyConverter) {
        this.originalPaymentGateway = originalPaymentGateway;
        this.currencyConverter = currencyConverter;
    }

    @Override
    public void processPayment(double amount, String currency) {
        double amountInUSD = currencyConverter.convert(amount, currency, "USD");
        originalPaymentGateway.processPayment(amountInUSD, "USD");
    }
}