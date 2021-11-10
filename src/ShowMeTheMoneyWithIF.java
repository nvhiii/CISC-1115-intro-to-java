import java.util.Scanner;

public class ShowMeTheMoneyWithIF {
    public static void main(String [] a) {
        int p, quantity, total, dollars, cents;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please type the item price in cents and then the number of items purchased." + "\n" + "Then hit RETURN");
        p = stdin.nextInt();
        quantity = stdin.nextInt();
        total = p * quantity;
        dollars = total / 100;
        cents = total % 100;
        if (0<=cents && cents<=9) {
            System.out.println("$" + dollars + ".0" + cents);
        } else if (cents==10) {
            System.out.println("$" + dollars + "." + cents);
        } else System.out.println("$" + dollars + "." + cents);
    }
}
