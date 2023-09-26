public class CharAtmethod {
    public static void main(String[] args) {
        
        //string arrays  also use zero based indexing
        // String fristname = "MOHIT";
        // String middlename = "CHHANENDRA";
        // String lastname = "PATLE";
        // String fullname = fristname + " " + middlename + " " + lastname;
        // System.out.println(fullname.charAt(10));


        //print string characters
        String str = "mohit chhanendra patle";
        printletters(str);

    }
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
