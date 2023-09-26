public class Accessmodifiers {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();
        myacc.username = ("mohitpatle");
        // myacc.password = ("1234");
        myacc.setPassword("asdf"); // change krliya
        System.out.println(myacc.username);
        // System.out.println(myacc.password); // access cant be done
        }
}

class BankAccount {
    public String username;
    private String password; // class ke bhar no one can access

    public void setPassword(String pwd) {
        password = pwd;
    }
}
