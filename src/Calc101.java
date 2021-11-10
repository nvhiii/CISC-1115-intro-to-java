import java.util.Scanner;

public class Calc101 {

    public static void main(String [] a) {
        int numdarts, cornerQuarterCircle = 0;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter number of darts to throw: ");
        numdarts = stdin.nextInt();

        for (int dart=0; dart<numdarts; dart++) {
            double x = Math.random();
            double y = Math.random();

            if ( y < x*x )
                cornerQuarterCircle++;
        }
        double quarterCircleRemainder = (double) cornerQuarterCircle / numdarts;
        System.out.println(quarterCircleRemainder);
      /*  double pi = 4.0 * quarterCircleRemainder;
        System.out.println("PI=" + pi);
        // Calculates hypothetical area of the corner edges given a circle w diameter of 2

       */
    }
}
