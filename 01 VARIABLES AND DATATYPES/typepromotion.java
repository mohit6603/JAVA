public class typepromotion {
    public static void main(String[] args) {
       //rule1
        // char a = 'a';
        // char b = 'b';
        // char c = a - b;
        //int to char not possible as a-b integ er ban gaya hai
        // System.out.println((int) (a));
        // System.out.println((int) (b));
        // System.out.println(b-a);
        // System.out.println(a-b);
        // System.out.println(a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a+b+c);
        // System.out.println(bt);
        // typecaasting but no sense to answer



       //rule2
       int d = 10;
       float e = 20.25f;
       long f = 25;
       double g = 30;
       double sum = d + e + f + g;
       System.out.println(sum);
       //int float long me output error ayenga
       //double ka storing capacity sabse bada hai to pura expression double me convert ho jayenga
       

       byte b = 5;
       byte a = (byte)(b*5);
       System.out.println(a);
       //byte a = b*5;  error int to byte due to type promotion
    }
    
}
