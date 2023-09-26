public class Insertionsort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);
    }


    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void insertionsort(int arr[]) {

        //turns require to sort an array  
        for(int i = 1; i<arr.length; i++){
            //int curr = i;                       yaha par curr hi tera temporary memory hai jisme tu values ko store karta hai
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]> curr){   //< descending
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
    }
}
