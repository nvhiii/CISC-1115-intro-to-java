import java.util.Scanner;

public class X5A {
    public static double discount(String x) {
        int periodIndex, dollarsToCentsInt, centsOnlyInt, totalCents;
        double discounted;
        String centsOnly, dollarsIntoCents;

        periodIndex = x.indexOf(".");
        centsOnly = x.substring(periodIndex);
        centsOnlyInt = Integer.parseInt(centsOnly);

        dollarsIntoCents = x.substring(0, periodIndex);
        dollarsToCentsInt = Integer.parseInt(dollarsIntoCents) * 100;

        totalCents = dollarsToCentsInt + centsOnlyInt;

        discounted = 0.9 * (double) totalCents;
        return discounted;
    }

    public static void main(String [] args) {
        String monetaryValue;
        Scanner stdin = new Scanner(System.in);
        monetaryValue = stdin.next();
        discount(monetaryValue);
        System.out.println(discount(monetaryValue));

    }
}
