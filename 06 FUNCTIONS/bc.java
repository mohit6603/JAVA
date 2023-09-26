public class bc {
    public static int  binomialcoeffficient(int n,int r) {
        int a = 1;
        for(int i = 1; i<=n; i++){
            a = i*a;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        binomialcoeffficient(n,r);
    }
    
}
