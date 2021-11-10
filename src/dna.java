import java.util.Scanner;

public class dna {

    public static void main(String[] a) {
        String sequence;
        Scanner stdin = new Scanner(System.in);
        sequence = stdin.nextLine();

        if
        ((sequence.contains("CG") || sequence.contains("GC") || sequence.contains("AT") || sequence.contains("TA") || sequence.contains("-")) && ((sequence.charAt(0) != '-') && (sequence.charAt(sequence.length()-1) != '-'))) {
            sequence = sequence.replaceAll("CG", "");
            sequence = sequence.replaceAll("GC", "");
            sequence = sequence.replaceAll("AT", "");
            sequence = sequence.replaceAll("TA", "");

            if
            (sequence.charAt(sequence.indexOf("-") + 1) != '-')  {
                sequence = sequence.replaceAll("-", "");
            }
            else {
                System.out.println("invalid");
            }


            if
            ("".equals(sequence))
                System.out.println("valid");



            stdin.close();
        }
    }
}