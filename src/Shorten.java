import java.util.Scanner;

public class Shorten {

    public static void firstLastLetter(String x) {
        System.out.println(x.substring(0,1) + "-" + x.substring(x.length()-1));
    }
    public static void main(String [] a) {
        String x;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a word: ");
        x = stdin.next();
        firstLastLetter(x);
    }
}
