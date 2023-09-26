public class ExceptionHandaling {
    public static void main(String[] args) {
        System.out.println("main method started");

        int a=10,b=0,c;
        
        try {
            c = a/b;
        System.out.println(c);
        } 
        catch (Exception e) {
        System.out.println(e);
        }

        System.out.println("main method ended");

    }
}
