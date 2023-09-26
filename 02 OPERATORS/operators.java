public class operators {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        System.out.println("add = " + (A+B));
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A%B);
        System.out.println(A/B);

        //preincrement   isme value pehle increase hongi then assign hongi
        int a = 10;
        int b =++a;
        System.out.println(a);
        System.out.println(b);
        
        //postincrement   isme phle value assign hongi then increment hongi
        int c = 10;
        int d =c++;
        System.out.println(c);
        System.out.println(d);

        //predecrement    isme phle value decrease hongi then assign hongi
        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        //postdecrement     value pehle assign hongi then decrement honga
        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);

         

        
    }
    
}
