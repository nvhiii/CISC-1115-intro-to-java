import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class AddFromFileWithEOD {

    public static void main(String [] a) throws Exception {
        String workingDirectory, dataFileName;
        int sum;

        workingDirectory = System.getProperty("user.dir");
        dataFileName = "data/" + a[0];

        File dataFile = new File(dataFileName);
        FileInputStream fis = new FileInputStream(dataFile);
        Scanner dataFileScan = new Scanner(fis);

        sum = 0;
        dataFileScan.hasNextLine();
        while(dataFileScan.hasNextInt()) {
            int n = dataFileScan.nextInt();
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}
