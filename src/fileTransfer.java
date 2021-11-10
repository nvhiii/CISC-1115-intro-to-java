import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileTransfer {

    public static void main(String [] a) throws Exception {
        File file = new File("C:/Users/Nahi/Desktop/identical.txt");
        Scanner stdin = new Scanner(file);

        String fileContent = "";
        while (stdin.hasNextLine()) {
            fileContent = fileContent.concat(stdin.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:/Users/Nahi/Desktop/mystuff.txt");
        writer.write(fileContent);
        writer.close();
    }
}
