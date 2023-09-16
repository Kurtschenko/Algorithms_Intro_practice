package app;
public class Main1 {

    static int count;

    private static final String CURRENCY = "USD";
    public static void main(String[] args) {

        double [] prices = new double [] {125.99, 199.99, 242.00, 102.89};

        System.out.println("Initial data:");

        count = 0;

        for(double price:prices) {

            count++;

        System.out.printf("%d) price is %s %.2f%n", count, CURRENCY, price);

        }

        for (int i =0; i < prices.length; i++) {
            for (int j = 1; j < (prices.length-1); j++) {
                if (prices [j-1] > prices [j]) {
                    double temp = prices [j-1];
                    prices [j-1] = prices [j];
                    prices [j] = temp;
                }
            }
        }

        System.out.println("\n Sorted data:");

        count = 0;

        for(double price:prices) {

            count++;

            System.out.printf("%d) price is %s %.2f%n", count, CURRENCY, price);
        }

        double maxValue = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices [i] > maxValue) {
                maxValue = prices[i];
            }
        }

        double minValue = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices [i] > maxValue) {
                minValue = prices[i];
            }
        }

        System.out.printf("%n Min price is %s %.2f%n" + "Max price is %s %.2f%n", CURRENCY, minValue, CURRENCY, maxValue);

    }
}
