public class Subarraysummaxmin {

    public static void subarray(int numbers[]) {
        int currentsum =0;
        int maxsum = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
           
            
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum = 0; //current sum fir se initlize karana padenga naye array me bcoz its value will change
                
                
                for (int k = start; k <= end; k++) {  //print karwana
                    //subarray sum
                    currentsum+=numbers[k];   //currentsum=currentsum + numbers[k]; subarray ka sum in place of print it
                }
                
                System.out.println(currentsum);       //ye sare sunarray ke sum ko print krwa raha hai
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("maxsum : "+ maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}
