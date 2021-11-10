import java.util.Scanner;

public class gradeSchool {
    public static void main(String[] a){
        int x;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter age (in years): ");
        x = stdin.nextInt();
        System.out.println(((x==2) || (x==3))? "nursery" :
                x==4? "preK" :
                        (5<=x && x<=11)? "K6" :
                                ((x==12) || (x==13))? "JS" :
                                        (14<=x && x<=17)? "HS" :
                "other");
    }
}
