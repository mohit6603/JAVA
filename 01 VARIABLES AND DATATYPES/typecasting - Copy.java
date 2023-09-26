import java.util.*;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //float f = 85.65f;
        //int a = f;
        //System.out.println(a);
        //above case will give error


        float f = 85.65f;
        int a = (int)(f);
        System.out.println(a); 
        //(int) f kaar dene se data loss kakre conversion possible hai



        //char to num type conversion value of a = 97 for furthur alphabates +1 add karte rhena hai
        char ch1 = 'a';
        char ch2 = 'b';
        char ch3 = 'c';
        int number1 = ch1;
        int number2 = ch2;
        int number3 = ch3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double d = 2.4567d;
        int q = (int)d;
        System.out.println(q);


        long l = 454;
        int z = (int)l;
        System.out.println(z);

    }
    
}
