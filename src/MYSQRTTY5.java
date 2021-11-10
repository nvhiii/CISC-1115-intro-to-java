import java.util.Scanner;

public class MYSQRTTY5 {

    public static boolean isCloseEnough(double v1, double v2) {
        double diff = v1-v2;
        diff = diff>=0.0? diff : -diff;
        return diff<0.001; // returns true or false
    }

    public static double mysqrt(double x) {
        double lowerBound, upperBound, middle, estimate;
        lowerBound = 1.0;
        upperBound = x;
        middle = (lowerBound + upperBound)/2.0;
        estimate = middle;
        //double estimate = x;
        long counter = 0;
        while( !isCloseEnough(estimate * estimate, x) ) { // will keep looping until is not close enough
            estimate = 1.0 + Math.random()*(x-1.0); // Math.random with a range from x to 1.0
            if (middle * middle > x) {
                upperBound = middle;
            } else {
                lowerBound = middle;
            }
            counter++;
        }
        // isCloseEnough(estimate * estimate, x);
        System.out.println(counter + " estimates made before termination");
        return estimate;
    }

    public static void main(String [] a) {
        double x, xsqrt;
        Scanner input = new Scanner(System.in);
        System.out.print("Gimme a number that is 1 or more: ");
        x = input.nextDouble();
        xsqrt = mysqrt(x);
        System.out.printf("The square root of %fi" , x, xsqrt); // printf used for String, object, and its args
    }

}
