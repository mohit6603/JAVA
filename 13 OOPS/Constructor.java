public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();    //non param
        Student s2 = new Student("mohit");  //constructor parameter wala
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int roll;
 
    Student(String name) {  //parameterized costructor
        this.name = name; 
        System.out.println("param constructor is called....");
    }

    Student() {  // non parameterized costructor 
        System.out.println("non param constructor is called....");
    }
}
