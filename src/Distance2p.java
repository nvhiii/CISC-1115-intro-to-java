import java.util.Scanner;

public class Distance2p {
    public static double sqr(double s){
        return  s * s;
    }
    public static double distance2p(double ax, double ay, double bx, double by){
        return (Math.sqrt(sqr(bx-ax) + sqr(by-ay)));
    }
    public static void main(String [] a){
        double ax, ay, bx, by;
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        ax = stdin.nextDouble();
        ay = stdin.nextDouble();
        bx = stdin.nextDouble();
        by = stdin.nextDouble();
        System.out.print(distance2p(ax, ay, bx, by));

    }
}
