public class decTobinary {

    public static void dectobin(int n) {
        int power = 0;
        int mynum = n;
        int binaryn = 0;

        while (n>0) {
            int remainder = n%2;
            binaryn = binaryn +(remainder *(int)Math.pow(10,power));
            power++;
            n = n/2;
        }

        System.out.println("binary form of " +mynum + " = " + binaryn );
    }
    public static void main(String[] args) {
        dectobin(15);
    }
}
