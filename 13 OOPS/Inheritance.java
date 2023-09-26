public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();
    }
}

// BASE CLASS
class Animal {
    String color;

    void eat() {
        System.out.println("fish eats....");
    }

    void breath() {
        System.out.println("fish breathsss....");
    }
}

// DERIVED CLASS
class Fish extends Animal {
    int gills;

    void swim() {
        System.out.println("fish swimss....");
    }
}