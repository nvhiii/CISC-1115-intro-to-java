import java.util.Scanner;

public class Add3 {
    public static void main(String[] a) {
        int w, x, y, z;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        w = stdin.nextInt();
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = w + x + y;
        System.out.println("The sum is: " + z);
    }
}
