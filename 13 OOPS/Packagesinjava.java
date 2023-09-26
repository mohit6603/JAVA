public class Packagesinjava {
    public static void main(String[] args) {
        Horse hs = new Horse();
        Chicken chiks = new Chicken();
        hs.walk();
        hs.eat();
        chiks.eat();
        chiks.walk();
    }
}

// abstract class
abstract class Animal {
    void eat() {
        System.out.println(" eats");
    }

    abstract void walk(); // ye sirf idea de raha hai
}

class Horse extends Animal { // ye subclasses us idea ko implement krr rh hai
    void walk() {
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on two legs");
    }
}