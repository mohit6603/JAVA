import java.util.*;

public class Keysearch {
    public static void main(String[] args) {
        
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;

        //input
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = 11;

        //output
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }

        search(matrix,key);
         
    }

    public static boolean search(int matrix[][], int key) {
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("key is at" + "(" + i + "," + j +")"); 
                    return true;
                }
            }
        }
        System.out.print("key not found ");
        return false;
    }
}
