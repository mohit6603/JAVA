public class Subarrays {

    public static void printsubarrray(int numbers[]) {
       int totalsubaray =0;
       
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                
                for (int k = start; k <= end; k++) {  //print karwana
                    System.out.print(numbers[k]+ " "); //subarray
                }
                totalsubaray++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total subarrays : "+ totalsubaray);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printsubarrray(numbers);
    }
}