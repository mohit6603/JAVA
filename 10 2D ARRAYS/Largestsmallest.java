import java.util.*;

public class Largestsmallest {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        //input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("largest number : " + largestsmallest(matrix));
    }

    public static int largestsmallest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j] >= largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] <= smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest number is : " + smallest);
        return largest;
    }
  
}
