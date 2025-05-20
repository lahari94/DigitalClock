
import java.util.Scanner;

public class CurrencyConverter {
    // Example exchange rates
    static double USD_TO_EUR = 0.92;
    static double USD_TO_INR = 83.10;
    static double USD_TO_GBP = 0.79;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("------------------");
        System.out.print("Enter amount in USD: ");
        double amountUSD = scanner.nextDouble();

        System.out.println("Choose target currency:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. Indian Rupee (INR)");
        System.out.println("3. British Pound (GBP)");
        System.out.print("Enter option (1-3): ");
        int option = scanner.nextInt();

        double convertedAmount = 0.0;
        String currencyName = "";

        switch (option) {
            case 1:
                convertedAmount = amountUSD * USD_TO_EUR;
                currencyName = "EUR";
                break;
            case 2:
                convertedAmount = amountUSD * USD_TO_INR;
                currencyName = "INR";
                break;
            case 3:
                convertedAmount = amountUSD * USD_TO_GBP;
                currencyName = "GBP";
                break;
            default:
                System.out.println("Invalid option!");
                return;
        }

        System.out.printf("%.2f USD = %.2f %s%n", amountUSD, convertedAmount, currencyName);
        scanner.close();
    }
}
