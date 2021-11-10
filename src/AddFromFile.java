import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class AddFromFile {

    public static void main(String [] a) throws Exception {
        int firstInt;
        String filename;
        filename = a[0]; // a refers to param in main ^^
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file); // fileR is the file to be read

        Scanner fileScanner = new Scanner(fis);
        firstInt = fileScanner.nextInt();
        System.out.println("first int of file " + filename + " is: " + firstInt);

        for (int i=0; i<4; i++) {
            int n = fileScanner.nextInt();
     //       int sum += n;
        }

    }

}
