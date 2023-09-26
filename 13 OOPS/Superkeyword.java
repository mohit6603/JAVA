public class Superkeyword {
    public static void main(String[] args) {
        Horse a = new Horse();
        System.out.println(a.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        //super.color = "orange";
        super();
        System.out.println("horse constructor called");
    }
}