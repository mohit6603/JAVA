public class Substring {
    public static void main(String[] args) {
        String str = "HelloWorld";
        //int si = 0, ei = 5;
        System.out.println(substring(str, 0, 5));

    }

    public static String substring(String str , int si , int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;

    }
}
 // preexisting java substring calculator
 // stringname.Substring(si,ei);  ei excluded