public class Override {
    public static void main(String[] args) {
        Child c = new Child();
        c.mainn();
    }
}

class Parent {
    void mainn() {
        System.out.println("12346789");

    }
}

class Child extends Parent {
    //@Override
    void mainn() {
        System.out.println("12346789"); 

    }
}