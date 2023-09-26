import java.util.*;
public class functions3 {
    //what happens in memory 
    public static void sum(int a,int b) {
        int sum = a+b;
        System.out.println(sum);
    
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sum(num1,num2);
    }
    
}
