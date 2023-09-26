import java.util.Scanner;

public class incometaxcalculator {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;                                  // jaava isko zero assign kar denga
        // if (income < 500000) {                   //500000 right 500,000wrong
        //     System.out.println( "tax = 0" );
            
        // }
        // else if (income >= 500000 && income <=1000000){
        //     System.out.println(tax=(int)(0.2*income));
        // }
        // else{
        //     System.out.println(tax = (int)(0.3*income));
        // }


        if (income < 500000) {                   //500000 right 500,000wrong
            tax =0;
        }
        else if (income >= 500000 && income <=1000000){
            tax =(int)(0.2*income);
        }
        else{
            tax =(int)(0.3*income);
        }
        System.out.println("your tax is" + tax);
        

    }

}