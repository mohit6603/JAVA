public class AP3 {
    public static void inverted_halfpyramid_withnumber(int row, int coloum) {
        for(int line = 1; line<=5 ; line++){
            for(int number = 1; number <= 6-line ; number++ ){
                System.out.print(number + " ");
                
            }
            for(int space = 1; space <= line-1; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
        // System.out.println();
    }
    public static void main(String[] args) {
        inverted_halfpyramid_withnumber(5,5);
    }
}
