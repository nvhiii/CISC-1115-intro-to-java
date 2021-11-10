import java.util.Scanner;

public class middleNumbers {

    public static void main(String [] args) {
        int n;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the # of elements in the array: ");
        n = stdin.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers in the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = stdin.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
