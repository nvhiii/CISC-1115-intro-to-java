import java.util.Scanner;

public class Count4LetterWords {

    public static void main(String [] a) {
        Scanner stdin = new Scanner(System.in);
        int numOf4LetterWords = 0;

        for (int j=0; j<10; j++) {
            String word = stdin.next();
            if (word.length() == 4)
                numOf4LetterWords++;
        }
        System.out.println("The number of four-letter words is: " + numOf4LetterWords);
    }
}
