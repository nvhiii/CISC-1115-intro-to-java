import java.util.Scanner;

public class wordStartWithT {

    public static void main(String[] a) {
        Scanner stdin = new Scanner(System.in);
        int numOfWordsStartWithT = 0;
        String words = stdin.nextLine();

        System.out.print("Write 20 words: ");
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(0) == 't') {
                numOfWordsStartWithT++;
            } else if (words.charAt(words.indexOf(" ") + 1) == 't') {
                numOfWordsStartWithT++;
            }
        }
        System.out.println("The number of words that start with the letter t is: "+numOfWordsStartWithT);

        stdin.close();

        // in need of finding a way to process individual words
        // like scanner next gets next word input, but how to
        // represent only the words which start with t as an int?
    }

    }



