import java.util.Scanner;

public class Calc101b {

    public static void main(String[] a) {
        int numdarts, underRedCurve = 0;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter number of darts to throw: ");
        numdarts = stdin.nextInt();

        for (int dart = 0; dart < numdarts; dart++) {
            double x = Math.random() * Math.PI;
            double y = Math.random();

            if (y < Math.sin(x))
                underRedCurve++;
        }
        double areaUnderRC = (double) underRedCurve / numdarts;
        System.out.println(areaUnderRC);
    }
}
