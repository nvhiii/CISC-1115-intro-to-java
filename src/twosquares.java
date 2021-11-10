import java.util.Scanner;

public class twosquares {
    public static void main(String[] a) {
        int S, twoS;
        double c, twoC, threeC, sum;
        Scanner stdin;
        stdin = new Scanner(System.in);
        System.out.print("Measurement of S: ");
        S = stdin.nextInt();
        twoS = S * 2;
        c = Math.sqrt((S * S) + (S * S));
        twoC = Math.sqrt((S * S) + (twoS * twoS));
        System.out.println(twoC);
        threeC = Math.sqrt((S * S) + (twoS * twoS));
        System.out.println(threeC);
        sum = threeC + twoC + c + S + S;
        System.out.println("The length of the purple path is " + sum);

    }
}
