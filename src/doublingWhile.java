public class doublingWhile {

    public static void main(String [] a) {
        int m, count;
        m = 13;
        count = 0;
        while (Math.pow(2, count) < m) {
            int doubling;
            doubling = (int) Math.pow(2, count);
            count++;
        }
        System.out.println(count);
    }
}
