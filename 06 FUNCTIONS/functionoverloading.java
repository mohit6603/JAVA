public class functionoverloading {
    //function overloading using different parameters

    //function to calculate sum of two numbers
    public static int sum(int a , int b) {
        return a+b;
    }

    //function to calculate sum of two numbers
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));

    }
}
