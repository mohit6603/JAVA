public class Binarysearch {

    public static int binarysearch(int numbers[],int key) {
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            //comparision
            if (numbers[mid]==key) {
                //System.out.println("required number is : "+ numbers[mid]);
                return mid;
            }
            if (numbers[mid] < key) {  //right
                start = mid+1;
            }
            else{ //left
                end = mid - 1;
            }       
        }
        return -1;  //key not exist
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14};
        int key = 10;
        //binarysearch(numbers, key);
        System.out.println("index for key is : "+ binarysearch(numbers, key));

    }
}
