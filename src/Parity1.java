import java.util.Scanner;

public class Parity1 {

    public static void oddOrEven(int x) {
        if
        (x%2 == 0) {
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }

    public static void main(String [] a) {
        int x;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        x = stdin.nextInt();
        oddOrEven(x);

        stdin.close();
    }
}
