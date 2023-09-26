import java.util.*; 

public class Largestsmallest {
    public static int largest(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest =  numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest ;
        //return smallest;
    }


    public static void main(String[] args) {
        int numbers[]= {1,2,6,3,5};
        System.out.println("largest value is : " +largest(numbers));
    }
}
