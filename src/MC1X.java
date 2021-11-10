import java.util.Scanner;

public class MC1X {
    public static void main(String [] a) {
        int numdarts, insideCircle = 0; // number of darts thrown (numdarts); incrementer (respectively)
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the number of darts to throw: ");
        numdarts = stdin.nextInt();

        for (int dart=0; dart<numdarts; dart++) {
            double x = Math.random(); // random x within range 0 & 1
            double y = Math.random(); // random y within range 0 & 1
                                      // every time looped, generates random coords
            if (y < Math.sqrt(1.0 - (x * x)))
                insideCircle++;

        }
        double quarterCircleArea = (double) insideCircle/numdarts;
        double pi = 4.0 * quarterCircleArea;
        System.out.println("π=" + pi);
    }
}
