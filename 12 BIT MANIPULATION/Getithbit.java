import java.util.*;

public class Getithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("enter decimal value : ");
        int n = sc.nextInt();
        //System.out.print("enter index value : ");
        int i = sc.nextInt();
        System.out.println("bit at index " + i + " is "+getithbit(n,i));
    }

    public static int getithbit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1; 
        }
    }
}
