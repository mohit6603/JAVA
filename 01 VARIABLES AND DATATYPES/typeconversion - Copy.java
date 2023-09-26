public class typeconversion {
    public static void main(String[] args) {
        // byte > short > int > float > long > double
        //above order reverse conversion not possible only forward possible

        byte a = 10;
        short b = a;
        System.out.println(b);
        
        int i = 10;
        long l = i;
        System.out.println(l);

        byte c = 20;
        int d = c;
        System.out.println(d);

        byte e = 23;
        float f = e;
        System.out.println(f);

        byte g = 123;
        long h = g;
        System.out.println(h);

        byte m = 103;
        double j = m;
        System.out.println(j);

        /*float f = 10.4f;
        int q = f;
        System.out.println(q);
        reverse conversion not possible*/

        
    }
    
}
