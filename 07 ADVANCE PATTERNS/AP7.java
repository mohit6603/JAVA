public class AP7 {
    public static void rohombus(int n ) {
        for (int i = 1; i <= 5; i++) {
            for (int space = 1; space <= 5-i ; space++) {
                System.out.print(" "); 
            }
            for (int star = 1; star <= 5 ; star++) {
                System.out.print("*"); 
            }
            // for (int space2 = 0; space2 <= i-2 ; space2++) {
            //     System.out.print(" "); 
            // }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rohombus(5);
    }
}
