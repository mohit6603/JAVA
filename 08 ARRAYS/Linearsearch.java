public class Linearsearch {
    public static int linearsearch(int numbers[], int key) {
            for(int i=0; i<numbers.length;i++){
                if(numbers[i] == key){
                    return i;
                }
            }
            return -1; //key doesnt exist
        }

    // public static void main(String[] args) {
    //     //LINEAR SEARCH
    //     int numbers[]={2,4,6,8,10,12,14,16};
    //     int key = 18;

    //     System.out.println(linearsearch(numbers,key));
    // }

    public static void main(String[] args) {
        //LINEAR SEARCH
        int numbers[]={2,4,6,8,10,12,14,16};
        int key = 14;

        int index = linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is at index : " + index);
        }

    }
}
