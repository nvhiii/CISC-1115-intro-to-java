import java.util.Scanner;

public class OrderedWeightsB {

    public static void inOrderAscendingDescending(double x, double y, double z) {
        if
        (x<y && y<z) {
            System.out.println("ascending order");
        }
        else if
        (x>y && y>z) {
            System.out.println("descending order");
        }
        else
            System.out.println("not in order");
    }

    public static void main(String [] a) {
        double x, y, z;
        Scanner stdin = new Scanner(System.in);

        x = stdin.nextDouble();
        y = stdin.nextDouble();
        z = stdin.nextDouble();
        inOrderAscendingDescending(x, y, z);
    }
}
