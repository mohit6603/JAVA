public class Selectionsort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);
    }

    public static void selectionsort(int arr[]) {
        int n  = arr.length;
        for(int i =0; i<n-1; i++){
            int minpos = i;


            for(int j = i+1; j<=n-1; j++){
                if(arr[minpos] > arr[j]){         //decreasing ke liye <
                    minpos= j;
                }
            }
        //swap
        int temp = arr[minpos];
        arr[minpos]= arr[i];
        arr[i]= temp;
        }

    }

    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
