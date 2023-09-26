public class Copyconstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "mohit";
        s1.roll = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Students s2 = new Students(s1);
        s2.marks[2] = 20; // updated marks
        s1.marks[2] = 100; // reason book
        for (int i = 0; i <= 2; i++) { // s2 marks print
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Students {
    String name;
    int roll;
    // boolean password;
    int marks[];

    // shallow copy constructor s1 ki properties ko s2 me transefer kar diya
    // public Students(Students s1) {
    //     marks = new int[3];
    //     this.roll = s1.roll;
    //     this.name = s1.name;
    //     this.marks = s1.marks;  // ye shallow krwa raha hai arrays me
    // }

    public Students(Students s1) {
        marks = new int[3];
        this.roll = s1.roll;
        this.name = s1.name;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    public Students() {
        marks = new int[3];
    }

    // public Students(String name) {
    //     marks = new int[3];
    //     this.name = name;
    // }

    // public Students(int roll) {
    //     marks = new int[3];
    //     this.roll = roll;
    // }
    // Students(boolean password) { // in case password type is string then will
    // give error due to function
    // // overloading
    // marks = new int[3];
    // this.password = password;
    // }
}
