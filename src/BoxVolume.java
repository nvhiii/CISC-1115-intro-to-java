import java.util.Scanner;

public class BoxVolume {
    public static void main(String[] a) {
        double length, width, height, volume;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please enter the length, width, and height: ");
        length = stdin.nextDouble();
        width = stdin.nextDouble();
        height = stdin.nextDouble();
        volume = length * width * height;
        System.out.println("Volume is: " + volume);
    }
}
