import java.util.Scanner;

public class StringTheoryTY5 {

  /*  public static String swapChars(String s, int i, int j) {
        if (i == j) {
            return s;
        }
        if (i > j) {
            int t=i; i=j; j=t;
        }
        return s.substring(0,i) + s.substring(j, j+1) + s.substring(i+1, j) + s.substring(i, i+1) + s.substring(j+1);
    }
    */


 /*   public static String reverse(String s) {
        String reverseOrder = "";
        for (int y = s.length()-1; y >= 0; y--) {
            reverseOrder += s.charAt(y);
        }

        if (s.equals(reverseOrder)) {
            return "You have unlocked a palindrome!";
        }
        return reverseOrder;
    }

  */

    public static String pad0(String a, String b) {
        int difference;
        difference = a.length() - b.length();
        if (difference >= 0) {
            return a;
        } else {
            for (int i = difference; i < difference; i++) {
                b += "0";
            }
            return b;
        }
    }

    public static void main(String[] a) {
        String s, t;
        int i, j;
        Scanner stdin = new Scanner(System.in);
        s = stdin.next();
        t = stdin.next();
    //    i = stdin.nextInt();
    //    j = stdin.nextInt();
    //    System.out.println(" ---> " + swapChars(s, i, j));
    //    System.out.println(" ---> " + reverse(s));
        System.out.println(pad0(s, t));
        System.out.println("The End.");
    }
}
