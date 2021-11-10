import java.io.*;
import java.util.Scanner;

public class WhereAmI {

    public static void main(String[] a) throws FileNotFoundException { // cheap exception
        String currentDirectory, filename, filenameRead, firstToken;

        currentDirectory = System.getProperty("user.dir");
        System.out.println("Current Directory is: " + currentDirectory);

        Scanner stdin = new Scanner(System.in);
        System.out.print("Filename: ");

        filename = stdin.next();
        File file = new File(filename); // can be used like Scanner 'file' is a var
        FileOutputStream fos = new FileOutputStream(file); // this needs importing and is the stream, also like scanner
        PrintStream ps = new PrintStream(fos);
        ps.println("Hello World!");
        ps.close();

        // Need filename (scanner input) (15)
        // To get data to-and-from files you need streams (16/17)
        // To add stuff to file, use printstream (19)

        System.out.print("Filename To Read: ");
        filenameRead = stdin.next();
        File fileRead = new File(filenameRead);
        FileInputStream fis = new FileInputStream(fileRead);
        Scanner fileScanner = new Scanner(fis);
        firstToken = fileScanner.next();
        System.out.println("first token of file " + filenameRead + " is: " + firstToken);

        // This above code allows for the reading of the text in a file
        // Filename is scanner input
    }
}
