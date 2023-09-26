public class Methodoverriding {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.eat();
        Deer d = new Deer();
        d.eat();
    }
}

//runtime polymorphism
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    // void eat() {
    //     System.out.println("eats grass only");
    // }
}