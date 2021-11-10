import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] a) {
        int x, y, z;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();

        System.out.println((x>y && x>z)? "The largest is: " + x :
                (y>x && y>z)? "The largest is: " + y :
                "The largest is: " + z);

    }
}
