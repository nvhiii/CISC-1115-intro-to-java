import java.util.Scanner;

public class cylinderAndCone {
    public static void main(String[] a) {
        double PI = 3.14159265;
        double h, r, area, volOfCone, volOfCylinder, monstrosity;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter height: ");
        h = stdin.nextDouble();
        System.out.print("Enter radius: ");
        r = stdin.nextDouble();
        area = PI * r * r;
        volOfCone = (area * h)/3;
        volOfCylinder = area * h;
        monstrosity = volOfCone + volOfCone + volOfCylinder;
        System.out.println("Volume is: " + monstrosity);

    }
}
