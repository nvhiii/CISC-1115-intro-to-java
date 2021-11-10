import java.util.Scanner;

public class Mangle1 {

    public static void first2Last2(String x, String y) {
        System.out.println(x.substring(0,2) + y.substring(y.length()-2));
    }

    public static void main(String [] a) {
        String x, y;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter two words: ");
        x = stdin.next();
        y = stdin.next();
        first2Last2(x, y);

        stdin.close();
    }
}
