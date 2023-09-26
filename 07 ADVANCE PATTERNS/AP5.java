public class AP5 {
    public static int triangle(int row , int coloum) {
        //number =j coloum    line = i row  
       for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i+j)%2==0) {
                System.out.print(" 1 ");
            } else {
                System.out.print(" 0 ");
            }      
        }
        for (int space = 1; space <= 5-i ; space++) {
            System.out.print(" ");
        }
        System.out.println();
       }
       return 2;
    }
    public static void main(String[] args) {
        triangle(5,5);
    }
}
