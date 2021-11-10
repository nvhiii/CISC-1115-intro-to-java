import java.util.Scanner;

public class RandomFun {

    //global variables for this class
    public static final long GAZILLION = 1000000000000L; // declaration of variable outside (1st try) LITERAL
    // only use final if value is constant
    public static long seed = 69L;
    public static long M = 13L;
    public static long B = (19L * 19L);
    // find appropriate values to make it a random number generator

    public static long myRandomLong() {
        seed = M * seed + B;
        return seed%GAZILLION;
    }

    public static double myRNG(){
        return (double) myRandomLong()/GAZILLION;
    }

    public static void main(String[] a) {
        int n;
        Scanner stdin = new Scanner(System.in);
        n = stdin.nextInt();
        int overHalf = 0;         // overHalf is the number of Math.random() return value greater than 0.5 so far
        int underHalf = 0;        // underHalf is the number of Math,random() return value less than 0.5
        int half = 0;             // half is the number of Math.random() return values equal to 0.5

        for (int i = 0; i < n; i++) {
            double ranval = myRNG();
            if (ranval>0.5) {
                overHalf++;
            }
            else if (ranval<0.5) {
                underHalf++;
            } else
                half++;
        }
        System.out.println("Over half: " + overHalf + "(" + ( (double) overHalf / n) * 100 + "%)");
        System.out.println("Over half: " + underHalf + "(" + ( (double) underHalf / n) * 100 + "%)");
        System.out.println("Over half: " + half + "(" + ( (double) half / n) * 100 + "%)");
    }
}
