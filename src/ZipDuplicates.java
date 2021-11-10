import java.util.Scanner;

public class ZipDuplicates {

    public static int duplicates(int x, int y, int z){
        return (x == y) && (x == z)? 2 :
                (x == y) || (x == z) || (y == z)? 1 :
                        0;
    }

    public static void main(String [] args) {
        int x, y, z;
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextInt();
        y = stdin.nextInt();
        z = stdin.nextInt();
        System.out.println(duplicates(x, y, z));

    }
}
