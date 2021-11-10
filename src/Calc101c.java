import java.util.Scanner;

public class Calc101c {

    public static void main(String [] a) {
        int nsubs;
        double width, totalArea, xmid;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Number of sub-intervals: ");
        nsubs = stdin.nextInt();

        totalArea = 0.0;
        width = Math.PI / nsubs;
        xmid = width / 2.0;

        for (int i=0; i<nsubs; i++) {

            double height = Math.sin(xmid); // height is y value calculated with x (fxn)
            double area = width * height;

            totalArea += area;
            xmid += width;
        }
        System.out.println("Area under the curve y = sin(x) is equal to: " + totalArea);
    }
}
