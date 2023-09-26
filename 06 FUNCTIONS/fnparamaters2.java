import java.util.*;
public class fnparamaters2 {
    // public static void calculatesum(){

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println("sum is : "+sum);

    // }



    //now shift main function code to calculatesum function
    // public static void calculatesum(){
    //    Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //  System.out.println("sum is : "+sum);
    // }
    // public static void main(String[] args) {
    // calculatesum();

    // }


    // public static void calculatesum(){
    //    Scanner sc = new Scanner(System.in);
    //    int sum = a + b;
    //    System.out.println("sum is : "+sum);
    // }
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculatesum();

    //     //above code will give error as calculatesum function is not aware of a and b

    // }


    //a and b yaha parameters ke form me pouchenge but 
    // public static void calculatesum(int a,int b){
    //    int sum = a + b;
    //    System.out.println("sum is : "+sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculatesum(a,b);

    // }


    // public static void calculatesum(int num1,int num2){
    //    int sum = num1 + num2;
    //    System.out.println("sum is : "+sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculatesum(a,b);

    // }


    //  public static int calculatesum(int num1,int num2){
    //  return num1 + num2;
    //  }
    //  public static void main(String[] args) {
    //      Scanner sc = new Scanner(System.in);
    //      int a = sc.nextInt();
    //      int b = sc.nextInt();
        
    //     System.out.println("sum is : "+ calculatesum(a,b));
        //upaar wale function ka sum variable aur niche wale function ka sum variable dono alag alag hai bcoz they are written in alag alag function
    //}

    public static int calculatesum(int num1,int num2){ //num1 and num2 are parameters or formal parameters
    int sum = num1 + num2;
    return sum;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum1 = calculatesum(a,b); //a and b are arguments or actual parameters
         System.out.println("sum is : "+ sum1);
    }
    }

