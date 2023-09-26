public class Multilevelinheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.eat();
        doggy.bark();
        doggy.warmblood();
        doggy.legs = 4;
        doggy.color = "blaackkkiii";
        System.out.println(doggy.color + " " + doggy.legs);
    }
}

// base classs
class Animal {
    String color;

    void eat() {
        System.out.println("fish eats....");
    }

    void breath() {
        System.out.println("fish breathsss....");
    }
}

// derived 1
class Mammel extends Animal {
    int legs;

    void warmblood() {
        System.out.println("mammel are warm blooded animals....");
    }
}

// derived 2
class Dog extends Mammel {
    String breed;

    void bark() {
        System.out.println("dogs do bark....");
    }
}
