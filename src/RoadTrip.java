import java.util.Scanner;

public class RoadTrip {
    public static void main(String[] a) {
        int budget, totalCostGas, dollars, cents;
        double mpg, totalTripMiles, ppg;
        String afford;
        Scanner stdin = new Scanner(System.in);

        mpg = stdin.nextDouble();
        totalTripMiles = stdin.nextDouble();
        ppg = stdin.nextDouble();
        budget = stdin.nextInt();

        totalCostGas = (int)((totalTripMiles/mpg)*ppg);

        dollars = totalCostGas/100;
        cents = totalCostGas%100;

        System.out.println("$" + dollars + "." + (cents<10? "0" : "") + cents);

        afford = budget >= totalCostGas? "in budget" : "over budget";

        System.out.println(afford);

        stdin.close();


    }
}