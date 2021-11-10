import java.util.Scanner;

public class DaysInYearNoIF {
    public static void main(String[] a){
        int year;
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        year = stdin.nextInt();
        System.out.println((year%4==0? "366 days" : "365 days"));

    }
}
