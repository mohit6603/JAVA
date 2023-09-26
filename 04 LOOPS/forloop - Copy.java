public class forloop {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //i++ or i=i+1
            //System.out.print(i+" ");
            System.out.println(i);
        }


        //print square pattern
        for (int line = 1 ; line <=4 ; line++) {
            System.out.println("****");
        }


        //print reverse of a number n is given
        // int n = 10899;
        // while( n > 0 ) {
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n / 10;

        // }
        // revrse of a given number
        int m = 10899;
        int reverse = 0;
        while (m > 0) {
            int lastdigit = m % 10;
            reverse = (reverse * 10) + lastdigit;
            m = m/10;   
        }
        System.out.println(reverse);

        }
    }

