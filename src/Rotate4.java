import java.util.Scanner;

public class Rotate4 {

    public static void main(String[] a) {
        String w, x, y, z;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter four words: ");
        w = stdin.next();
        x = stdin.next();
        y = stdin.next();
        z = stdin.next();
        System.out.println(z + " " + w + " " + x + " " + y);

        stdin.close();
    }
}
