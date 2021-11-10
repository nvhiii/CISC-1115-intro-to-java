import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] a) {
        double desiredArea, radius, PI = 3.14159;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Desired Area: ");
        desiredArea = stdin.nextDouble();
        radius = Math.sqrt((desiredArea/PI));
        System.out.println("The radius that will give you that area is: " + radius);
    }
}
