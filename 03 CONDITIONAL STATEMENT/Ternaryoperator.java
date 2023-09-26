public class Ternaryoperator {
    public static void main(String[] args) {
        int A = 10;
        String type = ((A%2)==0)? "even" : "odd";
        System.out.println(type);
        
        int B = 15;
        String BCS = ((B%2)==0)? "even" : "odd";
        System.out.println(BCS);

        //student will pass or fail
        int marks = 35;
        String result = (marks>=33)? "pass":"fail";
        System.out.println(result);

        int marks2 = 32;
        String result2 = (marks2>=33)? "pass":"fail";
        System.out.println(result2);
    }
    
}
