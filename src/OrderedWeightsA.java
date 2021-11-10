import java.util.Scanner;

public class OrderedWeightsA {

    public static void ascendingWeight(double x, double y, double z) {
        if
        (x<y && y<z) {
            System.out.println("ascending order");
        }
        else
            System.out.println("not ascending order");
    }

    public static void main(String[] a) {
        double x, y, z;
        Scanner stdin = new Scanner(System.in);

        x = stdin.nextDouble();
        y = stdin.nextDouble();
        z = stdin.nextDouble();
        ascendingWeight(x, y, z);

        stdin.close();
    }
}
