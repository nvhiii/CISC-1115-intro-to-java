import java.util.Scanner;

public class aspirin {
    public static void main(String[] a) {
        boolean riskHeartAttack, riskBleeding, aspirinNeeded;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Patient has risk of heart attack? ");
        riskHeartAttack = stdin.nextBoolean();
        System.out.println("Patient has risk of bleeding? ");
        riskBleeding = stdin.nextBoolean();
        aspirinNeeded = riskHeartAttack && !riskBleeding;
        System.out.println("Prescribe Low Dose Of Aspirin: " + aspirinNeeded);

    }
}
