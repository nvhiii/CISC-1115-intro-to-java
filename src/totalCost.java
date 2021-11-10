import java.util.Scanner;

public class totalCost {
    public static void main(String [] a){
        int quantity, indexOfDecimal, ddInt, ccInt, total, ddToCents, totalDollars;

        String money, dd, cc;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Unit price:");
        money = stdin.next();
        System.out.println("Number of items:");
        quantity = stdin.nextInt();
        indexOfDecimal = money.indexOf(".");
        dd = money.substring(1, indexOfDecimal);
        cc = money.substring(indexOfDecimal + 1, money.length());
        ddInt = Integer.parseInt(dd);
        ccInt = Integer.parseInt(cc);
        ddToCents = ddInt * 100;
        total = (ddToCents + ccInt) * quantity;
        System.out.println("Sales Total: $" + (total/100) + "." + (total%100<10 ? "0" : "") + (total%100));


    }
}
