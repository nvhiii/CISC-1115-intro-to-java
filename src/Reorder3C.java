import java.util.Scanner;

public class Reorder3C {

    public static void main(String[] a) {
        String x, y, z;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter three words: ");
        x = stdin.next();
        y = stdin.next();
        z = stdin.next();
        System.out.println(z + "\n" + y + "\n" + x);
    }
}
