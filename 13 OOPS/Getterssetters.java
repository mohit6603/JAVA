public class Getterssetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(7);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    public String getColor() { // getter private properties ki value ko print krwane use hote hai
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String newColor) { // setter private properties ki vaulues mogify krne use hote hai
        // color = newColor;
        this.color = newColor;
    }

    public void setTip(int newTip) {
        // tip = newTip;
        this.tip = newTip;
    }
}
