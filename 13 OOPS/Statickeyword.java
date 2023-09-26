public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "gps gondia";
        System.out.println(s1.schoolname);

        Student s2 = new Student();
        System.out.println(s2.schoolname);

        Student s3 = new Student();
        s3.schoolname = "PES gondia";
        System.out.println(s1.schoolname + " " + s2.schoolname +" " + s3.schoolname);

    }
}

class Student {
    public String name;
    public int roll;

    public static String schoolname; //jis property ko sabke liye same rakhna hai usko static laga do

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}