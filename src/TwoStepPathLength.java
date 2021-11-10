import java.util.Scanner;

public class TwoStepPathLength {
    public static void main(String[] a){
        double x1, x2, x3, y1, y2, y3, dist1, dist2, totalDist;
        Scanner stdin = new Scanner(System.in);
        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();
        x2 = stdin.nextDouble();
        y2 = stdin.nextDouble();
        x3 = stdin.nextDouble();
        y3 = stdin.nextDouble();
        dist1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        dist2 = Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)));
        totalDist = dist1 + dist2;
        System.out.println(totalDist);

    }
}
