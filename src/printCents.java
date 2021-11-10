import java.util.Scanner;

public class printCents {
    public static void main(String [] a){
        int d, cc, dToCents, totalCents;
        Scanner stdin = new Scanner(System.in);
        System.out.println("$d");
        d = stdin.nextInt();
        System.out.println(".cc");
        cc = stdin.nextInt();
        dToCents = d * 100;
        totalCents = dToCents + cc;
        System.out.println(totalCents);

    }
}
