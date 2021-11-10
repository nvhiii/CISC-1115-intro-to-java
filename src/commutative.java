import java.util.Scanner;

public class commutative {
    public static void main(String[] a) {
        int num1;
        int num2;
        int sum1;
        int sum2;
        int diff;
        Scanner stdin;
        stdin = new Scanner(System.in);
        System.out.print("What is your first term: ");
        num1 = stdin.nextInt();
        System.out.print("What is your second term: ");
        num2 = stdin.nextInt();
        sum1 = num1 + num2;
        sum2 = num2 + num1;
        diff = sum1 - sum2;
        System.out.println("Your first term is " + num1 + ", your second term is " + num2 + ", and your sum is " + sum1 + ".");
        System.out.println("Your first term is " + num2 + ", your second term is " + num1 + ", and your sum is " + sum2 + ".");
        System.out.println("The difference of the sums is " + diff + ".");
    }
}
