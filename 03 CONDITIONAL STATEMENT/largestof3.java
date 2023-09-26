import java.util.*;

public class largestof3 {
    public static void main(String[] args) {
        
        //user input se
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a>=b && a>=c) {
        //     System.out.println(a + " a is largest of three");
        // }
        // else if (b>=c){
        //     System.out.println(b + " b is largest of three");
        // }
        // else{
        //     System.out.println(c + " c is largest of three");
        // }


        int A =1 , B=3 , C=6;

        if ((A >= B) && (A >= C)) {
            System.out.println("largest is A"); 
        }
        else if (B >= C) {
            System.out.println("largest is B");
        }
        else {
            System.out.println("largest is C");
        }
    }
    
}
