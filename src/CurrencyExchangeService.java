class CurrencyExchangeService implements CurrencyConverter {
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return amount * 1.12;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            return amount * 1.31;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("KZT")) {
            return amount * 420;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return amount / 1.12;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            return amount * (1.31 / 1.12);
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("KZT")) {
            return amount * (420 / 1.12);
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            return amount / 1.31;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            return amount * (1.12 / 1.31);
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("KZT")) {
            return amount * (420 / 1.31);
        } else if (fromCurrency.equals("KZT") && toCurrency.equals("USD")) {
            return amount / 420;
        } else if (fromCurrency.equals("KZT") && toCurrency.equals("EUR")) {
            return amount * (1.12 / 420);
        } else if (fromCurrency.equals("KZT") && toCurrency.equals("GBP")) {
            return amount * (1.31 / 420);
        }
        return amount;
    }
}