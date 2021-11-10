import java.util.Scanner;

public class orderChangeWithCapitals {
    public static void main(String[] a){
        String line1, line2, line3, lineOneCapitalization, lineTwoCapitalization, lineThreeCapitalization, lineOneCapitalizationAndTypo, lineTwoCapitalizationAndTypo, lineThreeCapitalizationAndTypo;
        Scanner stdin = new Scanner(System.in);
        line1 = stdin.nextLine();
        line2= stdin.nextLine();
        line3 = stdin.nextLine();
        lineOneCapitalization = line1.toUpperCase();
        lineTwoCapitalization = line2.toUpperCase();
        lineThreeCapitalization = line3.toUpperCase();
        lineOneCapitalizationAndTypo = lineOneCapitalization.replaceAll("HTE", "THE");
        lineTwoCapitalizationAndTypo = lineTwoCapitalization.replaceAll("HTE", "THE");
        lineThreeCapitalizationAndTypo = lineThreeCapitalization.replaceAll("HTE", "THE");
        System.out.println(lineOneCapitalizationAndTypo);
        System.out.println(lineTwoCapitalizationAndTypo);
        System.out.println(lineThreeCapitalizationAndTypo);

    }
}
