import java.util.Scanner;

public class ShortestPath {

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

    public static double route1Distance(double ax, double ay, double bx, double by, double cx, double cy){
        return getPathLength(ax, ay, bx, by, cx, cy);
    }

    public static double route2Distance(double dx, double dy, double ex, double ey, double fx, double fy){
        return getPathLength(dx, dy, ex, ey, fx, fy);
    }

    public static void main(String [] args){
        String a, b;
        double ax, ay, bx, by, cx, cy, dx, dy, ex, ey, fx, fy;
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        a = stdin.next();
        ax = stdin.nextDouble();
        ay = stdin.nextDouble();
        bx = stdin.nextDouble();
        by = stdin.nextDouble();
        cx = stdin.nextDouble();
        cy = stdin.nextDouble();
        b = stdin.next();
        dx = stdin.nextDouble();
        dy = stdin.nextDouble();
        ex = stdin.nextDouble();
        ey = stdin.nextDouble();
        fx = stdin.nextDouble();
        fy = stdin.nextDouble();
        System.out.println(a + ": " + route1Distance(ax, ay, bx, by, cx, cy));
        System.out.println(b + ": " + route2Distance(dx, dy, ex, ey, fx, fy));
        System.out.println((route1Distance(ax, ay, bx, by, cx, cy) > route2Distance(dx, dy, ex, ey, fx, fy))? "shortest path: " + b :
                "shortest path: " + a);
    }
}
