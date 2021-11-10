import java.util.Scanner;

public class StringParity {

    public static void oddOrEvenWord(String x) {
        if
        (x.length()%2 == 0) {
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }

    public static void main(String[] a) {
        String x;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a word: ");
        x = stdin.next();
        oddOrEvenWord(x);

        stdin.close();
    }
}
