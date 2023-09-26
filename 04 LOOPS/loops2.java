import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {

        //print number from 1 to n taking n as user input
        Scanner sc  = new Scanner(System.in);
        int counter = 1;
        int range = sc.nextInt();
        while (counter <= range) {
            //System.out.println(counter);
            System.out.print(counter+" ");
            counter++;
            
        }
    }
    
}
