import java.util.Scanner;

public class Covfefe {

    public static void containsCovfefe(String x) {
        if
        (x.contains("covfefe")) {
            System.out.println("Donald was here");
        }
        else
            System.out.println("covfefe-free");
    }

    public static void main(String [] a) {
        String x;
        Scanner stdin = new Scanner(System.in);

        x = stdin.nextLine();
        containsCovfefe(x);

        stdin.close();
    }
}
