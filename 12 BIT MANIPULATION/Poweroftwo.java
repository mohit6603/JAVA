import java.util.*;
public class Poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(poweroftwo(n));
    }

    public static boolean poweroftwo(int n) {       //int nahi
        return (n & (n-1))==0;
    }
}
