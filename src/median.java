import java.util.Scanner;

public class median {
    public static void main(String[] a) {
        float v, w, x, y, z;
        Scanner stdin = new Scanner(System.in);
        v = stdin.nextFloat();
        w = stdin.nextFloat();
        x = stdin.nextFloat();
        y = stdin.nextFloat();
        z = stdin.nextFloat();
        if (v > w && v > x && v < y && v < z) {
            System.out.println(v);
        } else if (w > v && w > x && w < y && w <z) {
            System.out.println(w);
        } else if (x > v && x > w && x < y && x < z) {
            System.out.println(x);
        } else if (y > v && y > w && y < x && y<z) {
            System.out.println(y);
        } else System.out.println(z);
}
}