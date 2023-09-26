public class Typesofconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("mohit");
        Student s3 = new Student(123);
        System.out.println(s2.name + " " + s3.roll);
    }
}

class Student {
    int roll;
    String name;

    // constructor are called by parameter matching = constructor overloading
    // non parameterized
    public Student() {
        System.out.println("Constructor is called....");
    }

    // parameterized constructor
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
