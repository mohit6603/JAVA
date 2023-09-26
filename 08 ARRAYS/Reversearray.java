public class Reversearray {

    public static void reverseanarray(int numbers[]) {
       int first =0, last = numbers.length-1;        
       
       while (first<last) { //case will fail if last > frist  : for odd length array mid value stays at mid 
        //swap
        int temp = numbers[last];
        numbers[last]=numbers[first];
        numbers[first] = temp;
        first++;
        last--;
       }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        reverseanarray(numbers); //it simply mean your new array : int numbers[] = {10,8,6,4,2};

        for (int i = 0; i < numbers.length; i++) { //call by reference changes did in reversearray are applicable on main[];
            System.out.print(numbers[i]+ " ");
        }
    }
}
