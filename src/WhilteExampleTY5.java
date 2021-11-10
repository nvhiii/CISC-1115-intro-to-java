import java.util.Scanner;

public class WhilteExampleTY5 {

    public static void triplings(Scanner input) {
        int n = input.nextInt();

        int newNum = 1; // initialization
        int numCount = 0; // counter

        while (newNum <= n) {
            newNum *= 3;
            numCount++;
        }
        System.out.println("The number triplings, starting from 1, to reach or exceed " + n + " is: " + numCount);
    }

    public static void smartyPants(Scanner input) {

    }

    public static void smartyPants2(Scanner input) {
        int smallWordCount;
        String word;
        word = input.next();
    //    double x, y, z;
        smallWordCount = 0;
    //    x = 55.0;
    //    y = 66.0;

        while (input.next().length() < 10) {
            smallWordCount++;
        }
        System.out.println("Number of 'small' words read in before a 'long' word is: " + smallWordCount);
    }

    public static void main(String[] a) {
        Scanner stdin = new Scanner(System.in);
        triplings(stdin);
        smartyPants2(stdin);
    }
}
