import java.util.Scanner;

public class Reorder3B {
    public static void main(String [] a) {
        int x, y, z;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();
        System.out.println(z + " " + y + " " + x);
    }
}
