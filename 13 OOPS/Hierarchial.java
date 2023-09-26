public class Hierarchial {
    public static void main(String[] args) {

    }
}

// derived class
class Animal {
    String color;

    void eat() {
        System.out.println("fish eats....");
    }

    void breath() {
        System.out.println("fish breathsss....");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("birds can fly....");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("fish can swim....");
    }
}

class Mammel extends Animal {
    void walk() {
        System.out.println("mammel can walk....");
    }
}