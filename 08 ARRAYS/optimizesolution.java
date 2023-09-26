public class optimizesolution {

    public static void subarraysum(int numbers[]) {
        int currentsum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefixsum[] = new int [numbers.length];

        //calculate
        prefixsum[0]= numbers[0];
        for (int i = 1; i < prefixsum.length; i++) {
            prefixsum[i] = prefixsum[i -1] + numbers[i]; //pehle wale element ka sum + current number ka sum
        }
        
        for (int i = 0; i<numbers.length ; i++) {
            int start  = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                //currrentsum =prefixsum[end] - prefixsum[start-1]  to avoid negative  (prefixsum[start-1])== -ve index value we us down terniary structure
                currentsum = start==0? prefixsum[end] : prefixsum[end] - prefixsum[start-1];
                
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("maxsum = "+ maxsum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        subarraysum(numbers);
    }
}
