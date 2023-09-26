public class Fastexpo {
    public static void main(String[] args) {
        System.out.println(faastexpo(5,3));
    }

    //a^n
    public static int faastexpo(int a , int n) {
        
        int ans =1;
        while(n>0){
            if((n&1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}
