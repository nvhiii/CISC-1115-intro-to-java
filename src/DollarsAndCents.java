import java.util.Scanner;

public class DollarsAndCents {

    public static void centsToDollars(int x) {
        if
        (x<10) {
            System.out.println("$0.0" + x);
        }
        else if
        (x%100 == 0) {
            System.out.println("$" + x/100 + "." + x%100 + "0");
        }
        else
            System.out.println("$" + x/100 + "." + x%100);
    }

    public static void main(String [] a) {
        int x;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter cents: ");
        x = stdin.nextInt();
        centsToDollars(x);

        stdin.close();

    }
}
