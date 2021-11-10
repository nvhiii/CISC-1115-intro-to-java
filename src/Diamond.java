public class Diamond {

    public static void oneInEleven() {
        System.out.println(".....*.....");
    }
    public static void threeInEleven() {
        System.out.println("....***....");
    }
    public static void fiveInEleven() {
        System.out.println("...*****...");
    }
    public static void sevenInEleven() {
        System.out.println("..*******..");
    }
    public static void nineInEleven() {
        System.out.println(".*********.");
    }
    public static void upTriangle() {
        oneInEleven();
        threeInEleven();
        fiveInEleven();
        sevenInEleven();
        nineInEleven();
    }
    public static void downTriangle() {
        sevenInEleven();
        fiveInEleven();
        threeInEleven();
        oneInEleven();
    }
    public static void printDiamond() {
        upTriangle();
        downTriangle();
    }

    public static void main(String [] a) {
        printDiamond();
    }
}
