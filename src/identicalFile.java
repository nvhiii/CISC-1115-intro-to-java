import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class identicalFile {

    public static void main(String [] args) throws Exception {
        File file = new File("C:/Users/Nahi/Desktop/my idea.txt");
        Scanner stdin = new Scanner(file);

        String fileContent = "";
        while (stdin.hasNextLine()) {
            fileContent = fileContent.concat(stdin.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:/Users/Nahi/Desktop/my idea 2.txt");
        writer.write(fileContent);
        writer.close();
    }
}

/*
    public static void main(String [] a) throws Exception {
        File file = new File("C:/Users/Nahi/Desktop/cbrsp-1.txt");
        Scanner stdin = new Scanner(file);

        String fileContent = "";
        while (stdin.hasNextLine()) {
            fileContent = fileContent.concat(stdin.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:/Users/Nahi/Desktop/alexa.txt");
        writer.write(fileContent);
        writer.close();
    }
 */
