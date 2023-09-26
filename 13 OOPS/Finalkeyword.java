public class Finalkeyword {
    public static void main(String[] args) {
        Thief t = new Thief();
        t.atmpin();
        t.number();
    }
}

class Personal { // yadi class ko final keyword laga diya to furthur extension possible nahi
                 // honga != inheritance
    void number() {
        System.out.println("789456221");
    }

    void atmpin() { // when it doesnt contain final override is possibe for child class
        System.out.println("456123");
    }
}

class Thief extends Personal {
    //@Override
    void number() {
        System.out.println("789456221");
    }

    //@Override
    void atmpin() {
        System.out.println("456123");
    }
}