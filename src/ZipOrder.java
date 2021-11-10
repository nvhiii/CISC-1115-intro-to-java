import java.util.Scanner;

public class ZipOrder {

    public static String direction(int x, int y, int z){
        return (x<y && y<z)? "ASCENDING" :
                (x>y && y>z)? "DESCENDING" :
                "UNSORTED";
    }
    public static void main(String [] args) {
        int x, y, z;
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();
        System.out.println(direction(x, y, z));

    }
}
