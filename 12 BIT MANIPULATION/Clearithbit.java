public class Clearithbit {
    public static void main(String[] args) {
        System.out.println(setithbit(10,1));
   
        System.out.println(clearithbit(10,1));

        System.out.println(updateithbit(10,2,1));

    }

    public static int setithbit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearithbit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask ; 
    }

    public static int updateithbit(int n, int i , int newBit) {
        //newbit can be 0 or 1
        if(newBit == 0){
            return clearithbit(n,i);
        }else{
            return setithbit(n,i);
        }

        // n = clearithbit(n,i);
        // int bitMask = newBit << i;
        // return n | bitMask;
    }
}
