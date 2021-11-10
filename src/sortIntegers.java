import java.util.Scanner;

public class sortIntegers {
    public static void main(String [] a){
        int x, y, z;
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();
        System.out.println(((x>y && x>z) && (y>z))? z + " " + y + " " + x :
                ((x>y && x>z) && (z>y))? y + " " + z + " " + x :
                        (x>z && x<y)? z + " " + x + " " + y :
                                (x>y && x<z)? y + " " + x + " " + z :
                                        ((x<y && x<z) && (z>y))? x + " " + y + " " + z : x + " " + z + " " + y );
    }
}
