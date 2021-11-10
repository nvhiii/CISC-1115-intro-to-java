import java.util.Scanner;

public class DaysInYearWithIF {
    public static void main(String [] a) {
        int y;
        Scanner stdin = new Scanner(System.in);
        y = stdin.nextInt();
        if (y%4 == 0) {
            System.out.println("366 days");
        } else System.out.println("365 days");

    }
}
