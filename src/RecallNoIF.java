import java.util.Scanner;

public class RecallNoIF {
    public static void main(String[] a) {
        String carModel;
        int year;
        Scanner stdin = new Scanner(System.in);
        System.out.println();
        carModel = stdin.next(); year = stdin.nextInt();
        System.out.print(((carModel.equals("chevrolet") || (carModel.equals("oldsmobile")) && (((year >= 1987) && (year <= 1998)) || ((year > 2004) && (year % 2 != 0))))? "RECALL" :
                "NO RECALL" + "\n"));
    }
}
