public class Assignment {
    
    //QUESTION 1 ALL ARE IN DESCENDING ORDER 

    // public static void main(String[] args) {
    //     int arr[]= {3,6,2,1,8,7,4,5,3,1};
    //     bubblesort(arr);
    //     printarr(arr);
    // }

    // public static void bubblesort(int arr[]) {
    //     //turn = i
    //     for (int i = 0; i < arr.length ; i++) {

    //         //swap condition
    //         for (int j = 0; j < arr.length-1-i ; j++) {
    //             if(arr[j] < arr[j+1] ){
    //                 int temp = arr[j];
    //                 arr[j]= arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    // public static void printarr(int arr[]) {
    //     for (int i = 0; i <arr.length ; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    // }




    // QUESTION 2        
    // public static void main(String[] args) {     
    //     int arr[]= {3,6,2,1,8,7,4,5,3,1};
    //     selectionsort(arr);
    //     printarr(arr);
    // }
    // public static void selectionsort(int arr[]) {
    //     //turn =  = 4
    //     for (int i = 0; i <= arr.length-1 ; i++) {
    //         int minvalue = i;

    //         //min value find
    //         for (int j = i+1; j < arr.length ; j++) {
    //             if(arr[j] > arr[minvalue] ){
    //                 minvalue = j;
    //             }
    //         }
    //         int temp = arr[minvalue];
    //         arr[minvalue]= arr[i];
    //         arr[i] = temp;
    //     }
    // }
    // public static void printarr(int arr[]) {
    //     for (int i = 0; i <arr.length ; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    // }


     // QUESTION 3
    //  public static void main(String[] args) {
    //     int arr[]= {3,6,2,1,8,7,4,5,3,1};
    //     insertionsort(arr);
    //     printarr(arr);
    // }
    // public static void insertionsort(int arr[]) {
    //     //turns
    //     for (int i = 1; i <arr.length ; i++) {
    //         int curr = arr[i];
    //         int prev = i-1;

    //         //right position shifting
    //         while(prev>=0 && arr[prev]<curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]= curr;
    //     }
    // }
    // public static void printarr(int arr[]) {
    //     for (int i = 0; i <arr.length ; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    // }

    

// INBUILT SORT

    // public static void main(String[] args) {
    //     int arr[]= {3,6,2,1,8,7,4,5,3,1};
    //     inbuilt(arr);
    //     printarr(arr);
    // }
    // public static void inbuilt(int arr[]) {
    //     Arrays.sort(arr);
    // }
    // public static void printarr(int arr[]) {
    //     for (int i = 0; i <arr.length ; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    // }




    //inbuilt sort for selected index positiom

    // public static void main(String[] args) {
    //     int arr[]= {3,6,2,1,8,7,4,5,3,1};
    //     inbuilt(arr);
    //     printarr(arr);
    // }
    // public static void inbuilt(int arr[]) {
    //     Arrays.sort(arr,0,5);
    // }
    // public static void printarr(int arr[]) {
    //     for (int i = 0; i <arr.length ; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    // }




}
