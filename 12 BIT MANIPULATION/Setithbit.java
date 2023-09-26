public class Setithbit {
    public static void main(String[] args) {
        System.out.println(setithbit(9,2));
    }

    public static int setithbit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
}
