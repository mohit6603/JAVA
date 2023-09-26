import java.util.Scanner;

public class factorial {

    public static int fac (int n) {
        int f = 1 ;
        for (int i = 1; i <= n; i++) {
            f = f * i;    
        }
        System.out.println(f);
        return f;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fac(n);
        // int factorial = fac(n);
        // System.out.println(factorial);
    }
}
