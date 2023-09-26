// import java.util.Arrays;
// import java.util.Collections;
import java.util.*;

public class Reversesortfunction {
    
    public static void main(String[] args) {
        Integer arr[]= {5,4,1,3,2};
        //Arrays.sort(arr,0,3, Collections.reverseOrder());
        Arrays.sort(arr, Collections.reverseOrder());
        printarr(arr);
    }

    public static void printarr(Integer arr[]) {
        for(Integer i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
