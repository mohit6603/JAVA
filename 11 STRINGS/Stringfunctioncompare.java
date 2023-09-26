public class Stringfunctioncompare {
    public static void main(String[] args) {
        String s1 = "mohit";
        String s2 = "mohit";
        String s3 = new String("mohit");

        if (s1 == s2) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }


        if (s1 == s3) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }


        if (s1.equals(s3)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
    }
}
