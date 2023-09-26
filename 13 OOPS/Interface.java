public class Interface {
    public static void main(String[] args) {
        Queeen q = new Queeen();
        Rook r = new Rook();
        King k = new King();
        q.moves();
        r.moves();
        k.moves();

        Omnivores om = new Omnivores();
        om.veg();
        om.nonveg();

    }
}

interface ChessPlayer {
    public void moves();
}

class Queeen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal in all four direction");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, in all 4 diagonal by 1 step");
    }
}

// part 2
interface Herbivores {
    public void veg();
}

interface Carnivores {
    public void nonveg();
}

class Omnivores implements Herbivores, Carnivores {
    public void veg() {
        System.out.println("Eats veg");
    }

    public void nonveg() {
        System.out.println("Eats nonveg");

    }
}