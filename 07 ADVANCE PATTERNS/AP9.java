public class AP9 {
    public static void diamond(int n) {
        for (int i = 1; i <=n; i++) {
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars  oddno. 2x-1 or 2x+1 form me hote hai
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >=1; i--) {
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars  oddno. 2x-1 or 2x+1 form me hote hai
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
