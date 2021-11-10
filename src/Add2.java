import java.util.Scanner;

public class Add2 {
    public static void main(String[] a) {
        int x, y, z;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = x + y;
        System.out.println(z);
    }
}
