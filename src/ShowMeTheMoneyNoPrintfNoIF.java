import java.util.Scanner;

public class ShowMeTheMoneyNoPrintfNoIF {
    public static void main(String [] a) {
        int dollars, cents, quantity, p, total;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please type the item price in cents and then the number of items purchased. Then hit RETURN.");
        p = stdin.nextInt();
        quantity = stdin.nextInt();
        total = p * quantity;
        dollars = total / 100;
        cents = total % 100;
        System.out.println((0<=cents && cents<=9? "$" + dollars + ".0" + cents : cents==10? "$" + dollars + "." + cents : "$" + dollars + "." + cents));
    }
}
