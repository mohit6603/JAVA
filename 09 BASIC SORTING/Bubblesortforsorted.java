public class Bubblesortforsorted {
    
    public static void main(String[] args) {
        int arr [] = {3,2,1,4,5};
        Bubblesort(arr);
        printarr(arr);
    }

    public static void Bubblesort(int arr[]) {
        
        for(int turn = 0; turn< arr.length-1; turn++){
            int swap = 0;
            for(int j = 1; j< arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }else{
                    swap = 0;
                }   
            System.out.print("total swap : "+ swap);
            }
         }//System.out.println();
     }

    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

