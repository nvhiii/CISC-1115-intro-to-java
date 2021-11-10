import java.util.Scanner;

public class OrderedWeightsC {

    public static void ascendingOrder(double x, double y, double z) {
        if
        (x<y && y<z) {
            System.out.println(x + " " + y + " " + z);
        }
        else if
        (x>y && y>z) {
            System.out.println(z + " " + y + " " + x);
        }
        else if
        (x>y && z>y && x>z) {
            System.out.println(y + " " + z + " " + x);
        }
        else if
        (x>y && z>y && z>x) {
            System.out.println(y + " " + x + " " + z);
        }
        else if
        (y>x && y>z && x>z) {
            System.out.println(z + " " + x + " " + y);
        }
        else
            System.out.println(x + " " + z + " " + y);
    }

    public static void main(String [] a) {
        double x, y, z;
        Scanner stdin = new Scanner(System.in);

        x = stdin.nextDouble();
        y = stdin.nextDouble();
        z = stdin.nextDouble();
        ascendingOrder(x, y, z);

        stdin.close();
    }
}
