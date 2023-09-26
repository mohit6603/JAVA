public class OOPSassignment {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.display();
    }
}

//question 3
class Shape{
    protected void display(){
        System.out.println("display base");
    }
}
//Circle.java
//class Cicle extends Shape{
//        <access - modifier > void display(){
//        System.out.println(("display derived"));
//    }
//}
