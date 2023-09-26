import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddeven(n);
    }

    public static void oddeven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){   //least significant value == 0 even else odd
            //even
            System.out.println("EVEN");
        }
        else{
            //odd
            System.out.println("ODD");
        }
    }
}
 