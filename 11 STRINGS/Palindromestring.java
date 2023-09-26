public class Palindromestring {
    public static void main(String[] args) {
        String str = "RACECAR";    //MOOM NOON MADAM
        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1) ) {
                return false;      //not a palindrome
            }
        }
        return true;
    }
}
