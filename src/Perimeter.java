import java.util.Scanner;

public class Perimeter {
    public static void main(String [] a) {
        double side, c, c1, perimeter;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter S: ");
        side = stdin.nextDouble();
        c = Math.sqrt((side * side) + (side * side));
        c1 = Math.sqrt((side * side) + ((side + side) * (side + side)));
        perimeter = c + side + c1 + c1 + side;
        System.out.println("Perimeter is: " + perimeter);
    }
}
