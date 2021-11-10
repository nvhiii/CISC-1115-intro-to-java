import java.util.Scanner;

public class GetCents {

    public static void conversionToCents(String x, String y) {
        int dollarAmount = Integer.parseInt(x);
        int centsAmount = Integer.parseInt(y);

        if
        (dollarAmount == 0) {
            System.out.println(centsAmount);
        }
        else
            System.out.println((dollarAmount * 100) + centsAmount);
    }

    public static void main(String [] a) {
        int indexOfPeriod, indexOfDollarSign;
        String dcc, d, cc;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a dollar-and-cents amount: ");
        dcc = stdin.next();

        indexOfDollarSign = dcc.indexOf("$");
        indexOfPeriod = dcc.indexOf(".");
        d = dcc.substring(indexOfDollarSign + 1, indexOfPeriod);
        cc = dcc.substring(indexOfPeriod + 1);

        conversionToCents(d, cc);

        stdin.close();

    }
}
