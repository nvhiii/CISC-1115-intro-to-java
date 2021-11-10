import java.util.Scanner;

public class BestRoute {

    public static double sqr(double s){
        return  s * s;
    }

    public static double distance2p(double ax, double ay, double bx, double by){
        return (Math.sqrt(sqr(bx-ax) + sqr(by-ay)));
    }

    public static double getPathLength(double ax, double ay, double bx, double by, double dx, double dy){
        distance2p(ax, ay, bx, by);
        distance2p(bx, by, dx, dy);
        return distance2p(ax, ay, bx, by) + distance2p(bx, by, dx, dy);
    }

    public static double pathLength1(double ax, double ay, double bx, double by, double dx, double dy){
        return getPathLength(ax, ay, bx, by, dx, dy);
    }

    public static double pathLength2(double ax, double ay, double cx, double cy, double dx, double dy){
        return getPathLength(ax, ay, cx, cy, dx, dy);
    }

    public static void main(String [] args){
        String a, b, c, d;
        double ax, ay, bx, by, cx, cy, dx, dy;
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        a = stdin.next();
        ax = stdin.nextDouble();
        ay = stdin.nextDouble();
        b = stdin.next();
        bx = stdin.nextDouble();
        by = stdin.nextDouble();
        c = stdin.next();
        cx = stdin.nextDouble();
        cy = stdin.nextDouble();
        d = stdin.next();
        dx = stdin.nextDouble();
        dy = stdin.nextDouble();
        System.out.println((pathLength1(ax, ay, bx, by, dx, dy) >= pathLength2(ax, ay, cx, cy, dx, dy))? "Best Route: " + a + "-" + c + "-" + d :
                "Best Route: " + a + "-" + b + "-" + d);
    }

}
