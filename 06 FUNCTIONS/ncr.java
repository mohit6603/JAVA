import java.util.*;
public class ncr {
    public static int factorial(int n) {
        int f = 1 ;
        for (int i = 1; i <= n; i++) {
            f = f * i;    
        }
        return f;
    }


    public static int binomialcoefficient(int n , int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bc = a/(b*c);

        System.out.println("your binomial coefficient is : " + bc);
        return bc;

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter value of n : ");
        // int n = sc.nextInt();
        // System.out.println("enter value of r : ");
        // int r = sc.nextInt();
        binomialcoefficient(5,2);
    }
    
}
