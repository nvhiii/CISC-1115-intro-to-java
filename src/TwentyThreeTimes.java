import java.util.Scanner;

public class TwentyThreeTimes {

    public static void main(String [] a) {
        int x;
        Scanner stdin = new Scanner(System.in);
        System.out.print("integer please: ");
        x = stdin.nextInt();

        for (int i = 0; i < 23; i++) {
            System.out.println("The cube of " + x + " is " + (x * x * x));
        }
        stdin.close();
    }
}
