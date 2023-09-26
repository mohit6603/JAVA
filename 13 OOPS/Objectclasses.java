public class Objectclasses {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red"); // setcolor function ko call kar rhe hai red usme input denge vo implement kr
                            // denga
        p1.setTip(7);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
        p1.tip = 10;
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}
