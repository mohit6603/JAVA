public class Clearlastibits {
    public static void main(String[] args) {
        int n = 15;   //1111
        int i = 2;
        System.out.println(clearlastibits(n,i));
    }

    public static int clearlastibits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
}
//output 1100 ==12