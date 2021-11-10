import java.util.Scanner;

public class stringSubstring {
    public static void main(String [] args) {
        String inputString, substringToCheck;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        inputString = stdin.nextLine();
        System.out.println("Please enter the substring: ");
        substringToCheck = stdin.next();

        boolean isThere = inputString.contains(substringToCheck);
        if (isThere) {
            System.out.println("The substring is in the string.");
        } else {
            System.out.println("The substring is not the in the string.");
        }
    }
}
/*
        String input;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a string: ");
        input = stdin.nextLine();

        boolean isFound = input.contains("pie");
        if (isFound) {
            System.out.println("This sentence has the specified substring.");
        } else {
            System.out.println("This sentence does not have the specified substring");
        }
 */
