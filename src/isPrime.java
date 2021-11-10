import java.util.Scanner;

public class isPrime {

    public static void main(String [] a) {

        int x;
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextInt();
        boolean isDivisible = false;

        for (int i = 2; i <= x/2; i++) {
            // i starts at two because every integer is divisible by 1
            // In theory, we are incrementing every number up until the input
            // Thus checking if number is prime!
            if (x % i == 0) {
                isDivisible = true;
            }
        }

        if (!isDivisible) {
            System.out.println("The integer entered is a prime number.");
        } else {
            System.out.println("The integer entered is not a prime number");
        }


    }
}
