public class AP2 {
    public static void inverted_rotated_half_pyramid(int n , int coloum) {
        for(int i = 1 ; i<=n ;i++){
            //spaces
            for(int space = 1; space <=(n-i); space++){
                System.out.print(" ");
                
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.println();
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4,4);
    } 

}