import java.util.Scanner;

public class OriginDistance {
    public static void main(String[] a) {
        double x, y, z;
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextDouble();
        y = stdin.nextDouble();
        z = Math.sqrt((x * x) + (y * y));
        System.out.println(z);
    }
}
