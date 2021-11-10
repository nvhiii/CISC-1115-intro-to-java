import java.util.Scanner;

public class Parity2 {

    public static void bothIntOddOrEven(int x, int y) {
        if
        (x%2 == 0 && y%2 == 0) {
            System.out.println("both even");
        }
        else if
        (x%2 == 1 && y%2 == 1) {
            System.out.println("both odd");
        }
        else
            System.out.println("mixed");
    }

    public static void main(String [] a) {
        int x, y;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        x = stdin.nextInt();
        y = stdin.nextInt();
        bothIntOddOrEven(x, y);

        stdin.close();
    }
}
