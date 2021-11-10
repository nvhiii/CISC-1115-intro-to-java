import java.util.Scanner;

public class distributed {
    public static void main(String[] a) {
        int w, x, y, z, sum1, sum2, prod, prod1, prod2, prod3, prod4;
        Scanner stdin = new Scanner(System.in);
        System.out.println("please enter 4 integers: ");
        w = stdin.nextInt();
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();
        sum1 = w + x;
        sum2 = y + z;
        prod = sum1 * sum2;
        prod1 = w * y;
        prod2 = w * z;
        prod3 = x * y;
        prod4 = x * z;
        System.out.println("( " + w + " + " + x + " ) X ( " + y + " + " + z + " ) == " + sum1 + " X " + sum2 + " == " + prod);
        System.out.println(w + "X" + y + " + " + w + "X" + z + " + " + x + "X" + y + " + " + x + "X" + z + " == " + prod1 + " + " + prod2 + " + " + prod3 + " + " + prod4 + " == " + prod);
    }
}
