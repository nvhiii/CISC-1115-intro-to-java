import java.util.Scanner;

public class PointToPointDistance {
    public static void main(String [] a) {
        double x1, x2, y1, y2, distance;
        Scanner stdin = new Scanner(System.in);
        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();
        x2 = stdin.nextDouble();
        y2 = stdin.nextDouble();
        distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println(distance);

    }
}
