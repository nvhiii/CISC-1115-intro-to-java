import java.util.Scanner;

public class OddPredecessor {
    public static void main(String[] a) {
        int x;
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextInt();
        if ((x > 0) && (x % 2 == 0)) {
            System.out.println(x - 1);
        } else if ((x > 0) && (x % 2 == 1)) {
            System.out.println(x - 2);
        }
    }
}
