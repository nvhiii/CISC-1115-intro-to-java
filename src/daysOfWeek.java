import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] a){
        int x;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Weekday Number: ");
        x = stdin.nextInt();
        System.out.println((x<1 || x>=7)? "invalid" : x==1? "SUNDAY" : x==2? "MONDAY" : x==3? "TUESDAY" : x==4? "WEDNESDAY" : x==5? "THURSDAY" : x==6? "FRIDAY" : "SATURDAY");
    }
}
