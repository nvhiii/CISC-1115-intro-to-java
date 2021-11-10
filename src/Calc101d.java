import java.util.Scanner;

public class Calc101d {

    public static void main(String[] a) {
        int exponent, numOfRectangles, lowerB, upperB;
        double width, totalArea, xmid;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a lower bound: ");
        lowerB = stdin.nextInt();

        System.out.print("Enter an upper bound: ");
        upperB = stdin.nextInt();

        System.out.print("Enter an exponent: ");
        exponent = stdin.nextInt();

        System.out.print("Enter the number of rectangles you wish to use: ");
        numOfRectangles = stdin.nextInt();

        totalArea = 0.0;
        width = (upperB - lowerB) / (double) numOfRectangles;
        xmid = width / 2.0;

        for (int i = 0; i < numOfRectangles; i++) {

            double height = Math.pow(xmid, exponent);
            double area = width * height;

            totalArea += area;
            xmid += width;
        }
        System.out.println("The area under the curve given by y = x^c over the interval from a to b is: " + totalArea);
    }
}
