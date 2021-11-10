import java.util.Scanner;

public class MedianOf3 {
    public static void main(String[] a) {
        int x, y, z;
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();

        System.out.println(((x>y && x<z) || (x>z && x<y))? "The median is: " + x :
                ((y>x && y<z) || (y>z && y<x))? "The median is: " + y :
                "The median is: " + z);

    }
}
