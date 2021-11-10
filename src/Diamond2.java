import java.util.Scanner;

public class Diamond2 {

    public static void oneInEleven(String x, String y) {
        System.out.println(x + x + x + x + x + y + x + x + x + x +x);
    }
    public static void threeInEleven(String x, String y) {
        System.out.println(x + x + x + x + y + y + y + x + x + x +x);
    }
    public static void fiveInEleven(String x, String y) {
        System.out.println(x + x + x + y + y + y + y + y + x + x + x);
    }
    public static void sevenInEleven(String x, String y) {
        System.out.println(x + x + y + y + y + y + y + y + y + x + x);
    }
    public static void nineInEleven(String x, String y) {
        System.out.println(x + y + y + y + y + y + y + y + y + y + x);
    }
    public static void upTriangle(String x, String y) {
        oneInEleven(x, y);
        threeInEleven(x, y);
        fiveInEleven(x, y);
        sevenInEleven(x, y);
        nineInEleven(x, y);
    }
    public static void downTriangle(String x, String y) {
        sevenInEleven(x, y);
        fiveInEleven(x, y);
        threeInEleven(x, y);
        oneInEleven(x, y);
    }

    public static void printDiamond(String x, String y){
        upTriangle(x, y);
        downTriangle(x, y);
    }

    public static void main(String [] a) {
        String background, foreground;
        Scanner stdin = new Scanner(System.in);
        System.out.println("enter the background: ");
        background = stdin.next();
        System.out.println("enter the foreground: ");
        foreground = stdin.next();
        printDiamond(background, foreground);
    }
}
