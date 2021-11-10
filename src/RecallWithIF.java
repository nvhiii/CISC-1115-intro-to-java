import java.util.Scanner;

public class RecallWithIF {
    public static void main(String [] a) {
        String model;
        int y;
        Scanner stdin = new Scanner(System.in);
        model = stdin.next();
        y = stdin.nextInt();
        if ((model.equals("chevrolet") || model.equals("oldsmobile")) && ((y >= 1987 && y<=1998) || ((y > 2004) && (y%2 != 0)))) {
            System.out.println("RECALL");
        } else System.out.println("NO RECALL");
    }
}
