import java.util.Scanner;

public class floatingMedian {
    public static void main(String[] a){
        float v, w, x, y, z;
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        v = stdin.nextFloat();
        w = stdin.nextFloat();
        x = stdin.nextFloat();
        y = stdin.nextFloat();
        z = stdin.nextFloat();
        System.out.println((v>w && v>x && v>y && v>z));
    }
}
