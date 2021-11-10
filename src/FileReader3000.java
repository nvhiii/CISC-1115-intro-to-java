import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReader3000 {
    public static void main(String[] a) throws Exception {
        File file = new File("C:/Users/Nahi/Desktop/cbrsp-1.txt");
        Scanner stdin = new Scanner(file);

        String fileContent = "";
        while (stdin.hasNextLine()) {
            fileContent = fileContent.concat(stdin.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:/Users/Nahi/Desktop/newfile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
/*
import java.io.File;
import java.util.Scanner;

public class FileReader3000 {

    public static void main(String [] a) throws Exception {
        File file = new File("C:/Users/Nahi/Desktop/cbrsp-1.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
 */