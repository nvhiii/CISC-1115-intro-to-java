public class AddFromFile2 {

    public static void main(String [] a) throws Exception {
        String workingDirectory, dataFileName;
        int header, sum;

        workingDirectory = System.getProperty("user.dir");
        System.out.println(workingDirectory);
        dataFileName = "commutative/" + a[0]; // refers to first string typed in the file 'dataFile'
        System.out.println(dataFileName);
        /*
        File dataFile = new File(dataFileName);
        FileInputStream fis = new FileInputStream(dataFile);
        Scanner dataFileScan = new Scanner(fis);

        header = dataFileScan.nextInt(); // testing data in the file, "heads" the text file of data
        sum = 0; // sum equals the sum of all the integers read in so far
        for (int i=0; i<5; i++) {
            int n = dataFileScan.nextInt();
            sum += n;
        }
        System.out.println("Sum = " + sum);

         */
    }
}
