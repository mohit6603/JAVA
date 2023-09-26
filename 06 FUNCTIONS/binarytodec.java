public class binarytodec {
    
    //b to d
    public static void binTodec(int binaryn) {
        int mynumber = binaryn;
        int power = 0;
        int decimal = 0;
        while (binaryn > 0) {
            int lastdigit = binaryn%10; //last digit calculate honga %10 krne se
            decimal = decimal + (lastdigit * (int)Math.pow(2, power));
            power++; 
            binaryn = binaryn/10; //no chota honga
        }
        System.out.println("decimal of " + mynumber + " = " + decimal);
    }
    public static void main(String[] args) {
        binTodec(1111);

    } 
}
