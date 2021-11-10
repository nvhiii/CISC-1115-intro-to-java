import java.util.Scanner;

public class Initials {

    public static void initialsWithPeriod(String x, String y) {
        System.out.println(x.substring(0,1) + "." + y.substring(0,1) + ".");
    }

    public static void main(String [] a) {
        String x, y;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter two words: ");
        x = stdin.next();
        y = stdin.next();
        initialsWithPeriod(x,y);

        stdin.close();
    }
}
