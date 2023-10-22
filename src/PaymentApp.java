import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class PaymentApp {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));

        PaymentGateway originalPaymentGateway = new CardPaymentGateway();
        CurrencyConverter currencyConverter = new CurrencyExchangeService();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму платежа: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Считываем перевод строки

        System.out.print("Введите валюту платежа (USD, EUR, GBP, KZT): ");
        String currency = scanner.nextLine().toUpperCase();

        PaymentGateway adapter = new CurrencyPaymentAdapter(originalPaymentGateway, currencyConverter);

        adapter.processPayment(amount, currency);
    }
}





