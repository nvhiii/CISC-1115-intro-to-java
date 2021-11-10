import java.util.Scanner;

public class DupCount {

    public static void numberOfRepeat(String x, String y, String z) {
        if
        (x.equals(y) && x.equals(z)) {
            System.out.println(3);
        }
        else if
        (x.equals(y) || x.equals(z) || y.equals(z)) {
            System.out.println(2);
        }
        else
            System.out.println(0);
    }

    public static void main(String [] a) {
        String x, y, z;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter three words: ");
        x = stdin.next();
        y = stdin.next();
        z = stdin.next();
        numberOfRepeat(x, y, z);

    }
}
