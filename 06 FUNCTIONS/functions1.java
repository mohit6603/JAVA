 public class functions1 {
    
    //self made function
    public static void helloworld(){
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        //return;
    }
    public static int printhelloworld(){
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        return 1;

    }

    //main function code yaha se execute hota hai
    //helloworld();  == function ko call kiya main function ne
    // upar wale function me jitne bhi bar helloworld print karana ho us function ko main function me ek hi bar call kaarna padta hai
    public static void main(String[] args) {
    helloworld();
    printhelloworld();
    }
    
}
