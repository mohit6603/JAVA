import java.util.Scanner;

 public class continue1 {


    public static void main(String[] args) {
        // for(int i = 1; i <= 10; i++ ){
        //     if (i == 4) {
        //         continue;
        //         // jab i == 4 honda tab vo skip ho jayenga
        //     }
        //     //System.out.println(i);
        //     System.out.print(i + " ");
        // }


    //display all numbers entered by user expect multiples of 10 sc.
    // Scanner sc = new Scanner(System.in);
    // do {
    //     System.out.print("enter your number : ");
    //     int n = sc.nextInt();
    //     if (n %10 == 0) {
    //         continue;
    //     }
    //     System.out.println("your number was : " + n );
    // } while (true);  //isko smjhna hai


    //check a number is prime or not
    Scanner sc = new Scanner (System.in);
    System.out.print("enter your number : ");
    int n = sc.nextInt();

    boolean isPrime = true;
           for (int i = 2; i <= n-1; i++) {
            if (n%i==0) {
                isPrime = false;
           }    
    }
    if (isPrime == true){
        System.out.println(n + " is a prime number");
    
    }
    else{
        System.out.println(n + " is not a prime number");
    }
}
 }
   

