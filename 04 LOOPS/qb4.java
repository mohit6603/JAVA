import java.util.*;

public class qb4 {
    public static void main(String[] args) {

        //q1
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello");
        //     i+=2;
            
        // }

        //q2
        // Scanner sc = new Scanner(System.in);
        // doint a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // if (sum%2 == 0) {
        //     System.out.println(sum +" is a even number");
        // }
        // else {
        //     System.out.println(sum + " is odd number");
        // }


        //q2 by loops
        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.println("enter your number 1");
        //     int n = sc.nextInt();
        //     System.out.println("enter your number 2");
        //     int m = sc.nextInt();
        //     int sum = m+n;
        //     if (sum%2==0) {
        //         System.out.println(sum + "  is even");
        //     } else {
        //         System.out.println(sum + "  is odd");
        //     }
        // } while (true);



        //Prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("ia a prime number");
        }
        else{
        boolean isPrime = true;
        for(int i =2; i<=n-1; i++){
            if (n % i== 0) {
                isPrime = false;
            }
        }
        if(isPrime= true){
            System.out.println("is a prime number ");
        }
        else{
            System.out.println("is not a prime number");
        }
        }
        }
    }

    
    
    

