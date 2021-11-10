import java.util.Scanner;

public class RangeOf3Temperatures {

    public static double high(double x, double y, double z) {
        if
        (x>y && x>z) {
            return x;
        }
        else if
        (y>x && y>z) {
            return y;
        }
        else
            return z;
    }

    public static double low(double x, double y, double z) {
        if
        (x<y && x<z) {
            return x;
        }
        else if
        (y<x && y<z) {
            return y;
        }
        else return z;
    }

    public static void main(String[] a) {
        double x, y, z;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter three temperatures: ");
        x = stdin.nextDouble();
        y = stdin.nextDouble();
        z = stdin.nextDouble();
        System.out.println("The range is: " + (high(x, y, z) - low(x, y, z)));

        stdin.close();
    }
}
