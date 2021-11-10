import java.util.Scanner;

public class StringReader {

    public static int GetNumberEvenLengthWordsInString(String x) {
        int evenNumberWord;
        evenNumberWord = 0;
        Scanner stringScanner = new Scanner(x);
        while (stringScanner.hasNext()) {
            String token = stringScanner.next();
            if (token.length()%2 == 0) {
                evenNumberWord++;
            }
        }
        stringScanner.close(); // ALWAYS CLOSE
        return evenNumberWord;
    }

    public static void main(String [] a) {

        Scanner keybd = new Scanner(System.in);
        while (keybd.hasNextLine()) {
            String line = keybd.nextLine();
            int n = GetNumberEvenLengthWordsInString(line);
            System.out.println("In the line you just typed, there are " + n + " words of even length.");
        }
        String someString;
        someString = "Now is the time for all good programmers to fix those $!@#$!@# bugs!";
        Scanner stringScanner = new Scanner(someString);
        while (stringScanner.hasNextInt()) {
            String token = stringScanner.next();
            System.out.println(token);
        }
        stringScanner.close();
    }
}
