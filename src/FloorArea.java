import java.util.Scanner;

public class FloorArea {
    public static void main(String[] a) {
        double length, width, area;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Length: ");
        length = stdin.nextDouble();
        System.out.print("Width: ");
        width = stdin.nextDouble();
        area = length * width;
        System.out.println("Area is: " + area);
    }
}
