import java.util.Scanner;

public class HW10 {

    public static void main(String[] a) {
        int nHellos;
        Scanner stdin = new Scanner(System.in);

        System.out.print("How many HWs do you really want? ");
        nHellos = stdin.nextInt();
        for (int i = 0; i < nHellos; i++) {
            System.out.println("Hello, World: #" + (i+1));

        }
    }
}
