public class Constructorcallinghirerarchy {
    public static void main(String[] args) {
        // animal -> Horse -> mustange -> chicken
        Chicken chik = new Chicken();
        Mustange mg = new Mustange();
        Horse h = new Horse();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
}

class Mustange extends Animal {
    Mustange() {
        System.out.println("mustange constructor called");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chiken constructor called");
    }
}