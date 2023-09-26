public class Bitmanipulationbasics {
    public static void main(String[] args) {
        System.out.println(5&6);

        System.out.println(5|6);

        System.out.println(5^6);

        System.out.println(~0);

        System.out.println(5 << 2); //leftshift

        System.out.println(9 >> 4); //rightsift jitne digit ko rightshift krna hai utne digit binary no. me se gayab ho jayenge

        //q1
        int a = 10;
        System.out.println(a^a);

        //q2
        int x=10,y=5;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("value of x :" + x + " value of y : " + y);

        //q3
        int n = 8;
        int newvalue = n|(n+1);
        System.out.println(newvalue);


    }
}
