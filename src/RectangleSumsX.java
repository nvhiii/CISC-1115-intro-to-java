import java.util.Scanner;

public class RectangleSumsX {

    public static void main(String [] a) {
        int nsubs;
        double width, totalArea, xmid;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Number of sub-intervals: ");
        nsubs = stdin.nextInt();

        totalArea = 0.0; // total area of rectangles computed so far
        width = 1.0 / nsubs;
        xmid = width / 2.0; // the midpoint of the recurring subinterval

        for (int i=0; i<nsubs; i++) {

            double height = xmid * xmid;
            double area = width * height;

            totalArea += area; // ACCUMALTION!!!!!!! ; equivalent to totalarea = totalarea + area
            xmid += width; // for every loop, xmid increases by 0.2
        }
        System.out.println("Area under the curve y=x*x over the interval [0, 1] is: " + totalArea);
    }
}
