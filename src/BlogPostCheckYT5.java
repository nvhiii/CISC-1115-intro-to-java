import java.util.Scanner;

public class BlogPostCheckYT5 {

    public static void checkPost(Scanner input) {

        String comment = input.nextLine();
        while (comment.length() <= 300) {
            System.out.println("COMMENT: " + comment);
            comment = input.nextLine();
        }
        while (comment.length() > 300) {
            System.out.println(comment.substring(0, 300));
            comment = input.nextLine();
        }
    }

    public static void main(String[] a) {
        Scanner stdin = new Scanner(System.in);
        checkPost(stdin);
    }
}
