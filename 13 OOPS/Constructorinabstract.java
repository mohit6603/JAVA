public class Constructorinabstract {
    public static void main(String[] args) {
        Horse hs = new Horse();
        Chicken chiks = new Chicken();
        System.out.println(hs.color);
        System.out.println(chiks.color);
        // Animal a = new Animal();
        // System.out.println(a.color); abctract class ka obj cant create
    }
}

abstract class Animal {
    String color; // color define

    Animal() { // constructor
        color = "brown"; // constructor ka kam initally vo sare animlas ko brown color dedenga
    }

    void eat() {
        System.out.println(" eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changecolor() { // here color of animal can be changed
        color = "dark black";
    }

    void walk() {
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal {
    void changecolor() {
        color = "black";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}