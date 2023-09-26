public class primeno {
    public static boolean isprime(int n ) {
        //boolean isprime =true;
        for(int i=2 ; i<=n-1 ; i++) {
            if(n % i == 0){
                return false;
                //isprime = false;
                //break;
            }
        }
        return true;
        //return isprime;    

    }

    public static void main(String[] args) {
        System.out.println(isprime(10));
    }
    
}

//only for n>=2
//int (n==2);
//return true;
//aage ka code run nahi hoyenga