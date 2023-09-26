public class AP4 {
    public static void floyds(int row, int coloum) {
        int counter = 1;
        for(int line = 1; line<=5; line++){
            for(int number = 1; number <= line; number++){
                System.out.print(counter + " ");
                counter++;
            }
            for(int space = 1; space <= 5-line; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds(5,5);
    }
    
}
