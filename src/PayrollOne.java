import java.util.Scanner;

public class PayrollOne {
    public static void main(String [] a) {
        int prCents, hoursWorked, grossPay, dollars, cents,  extraWork, total;
        double overtimePayRate, overtimeMoney;
        Scanner stdin = new Scanner(System.in);
        prCents = stdin.nextInt();
        hoursWorked = stdin.nextInt();
        grossPay = prCents * hoursWorked;
        overtimePayRate = 1.5 * prCents;
        extraWork = hoursWorked - 40;
        overtimeMoney = overtimePayRate * extraWork;
        total = (int) overtimeMoney + grossPay;
        System.out.println(total);
        dollars = total / 100;
        cents = total % 100;
        if ((hoursWorked <= 40) && (0 <= cents && cents <= 9)) {
            System.out.println("$" + dollars + ".0" + cents);
        } else if ((hoursWorked <= 40) && (cents == 10)) {
            System.out.println("$" + dollars + "." + cents);
        } else if (hoursWorked <= 40) {
            System.out.println("$" + dollars + "." + cents);
        } else if((hoursWorked > 40) && (0<=cents && cents<=9)) {
            System.out.println("$" + dollars + ".0" + cents);
        } else if ((hoursWorked > 40) && (cents==10)) {
            System.out.println("$" + dollars + "." + cents);
        } else System.out.println("$" + dollars + "." + cents);
    }
}
