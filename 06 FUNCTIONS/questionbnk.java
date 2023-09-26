import java.util.*;
public class questionbnk {
    
    //Q1 genral method
    // public static void average(int a, int b, int c) {
    //     int average = (a+b+c) /3;
    //     System.out.println(average);
    // }


    // public static void useraverage(int a, int b, int c) {
    //     int average = (a+b+c)/3;
    //     System.out.println(average);
    // }


    // public static void main(String[] args) {
    //     //average(10, 5, 15);
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter value of a");
    //     int a = sc.nextInt();
    //     System.out.println("enter value of b");
    //     int b = sc.nextInt();
    //     System.out.println("enter value of c");
    //     int c = sc.nextInt();
    //     useraverage(a, b, c);
    //}


    //question2
    // public static int isEven(int a) {
    //     int x = a%2;
    //     if(x==0){
    //         System.out.println("True");
    //     }else{
    //         System.out.println("False");
    //     }
    //     return 1;
    // }

    // public static void main(String[] args) {
    //     isEven(45);
    // }


    // public static int isEven(int a) {
    //     int x = a%2;
    //     if(x==0){
    //         System.out.println("True");
    //     }else{
    //         System.out.println("False");
    //     }
    //     return 1;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter value of a");
    //     int a = sc.nextInt();
    //     isEven(a);
    // }


    //question 3

    public static void palindrome(int n) {
        while (n>0) {
            int lastdigit = n %10;
            System.out.println(lastdigit);
            n=n/10;
        }
        if (lastdigit==n) {
            System.out.println(n+" is a palindrome");
        } else {
            System.out.println(n+ " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(121);
    }
}
