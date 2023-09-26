import java.util.*;

public class arrays1 {
    public static void main(String[] args) {

        //arrays creation
        // int marks[] = new int[50];
        // int numbers[] = {1,2,3};


        //input
        int marks[]= new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt(); //physics
        marks[1]=sc.nextInt(); //chemistry
        marks[2]=sc.nextInt(); //maths

        //output
        //System.out.println("physics " + marks[0]);
        //System.out.println("chemistry "+ marks[1]);
        System.out.println("maths " + marks[2]);


        //changes in values of arrays
        marks[0]=100;
        marks[1] = marks[1]+1;
        System.out.println("physics " + marks[0]);
        System.out.println("chemistry " + marks[1]);

     
    }
}
