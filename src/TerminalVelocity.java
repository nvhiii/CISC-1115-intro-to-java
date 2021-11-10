import java.util.Scanner;

public class TerminalVelocity {
    public static void main(String[] a){
        double g, h, speedAtGround, nnn;
        g = 32;
        Scanner stdin = new Scanner(System.in);
        h = stdin.nextDouble();
        speedAtGround = Math.sqrt(2 * g * h);
        nnn = (speedAtGround * 3600) / 5280;
        System.out.println("TERMINAL VELOCITY: " + nnn + " MILES PER HOUR");

    }
}
