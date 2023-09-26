import java.util.Scanner;

public class qb3 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //q1
        // int number = sc.nextInt();
        // if(number>0){
        //     System.out.println( number+": is a positive");
        // }
        // else if(number == 0){
        //     System.out.println("niether positive or negative");
        // }
        // else{
        //     System.out.println(number + ":is a negative");
        // }

        //q2
        // double temp = 66.5;
        // if (temp>100){
        //     System.out.println("you have a fever");
        // }
        // else{
        //     System.out.println("you dont have fever");
        // }


        //q3
        //int day = sc.nextInt();
        //char dayname = sc.next().charAt();

        // switch(day){
        //     case 1 : System.out.println("MONDAY");
        //     break;
        //     case 2 : System.out.println("TUESDAY");
        //     break;
        //     case 3 : System.out.println("WEDNESDAY");
        //     break;
        //     case 4 : System.out.println("THRUSDAY");
        //     break;
        //     case 5 : System.out.println("FRIDAY");
        //     break;
        //     case 6 : System.out.println("SATURDAY");
        //     break;
        //     case 7 : System.out.println("SUNDAY");
        //     break;
        //     default : System.out.println("entered number is greater than 7");
        // }


    //q4
    // int a = 63, b = 36;
    // boolean x = (a < b) ? true : false;
    // System.out.println(x);
    // int y = (a > b) ? a : b;
    // System.out.println(y);


    //q5
    System.out.println("input a year");
    int year = sc.nextInt();
    if((year % 4 == 0) && (year%100==0) && (year%400==0)){
        System.out.println(year + " is a leap year");
    }
    else{
        System.out.println(year + " is not a leap year");
    }

 }
    
}
