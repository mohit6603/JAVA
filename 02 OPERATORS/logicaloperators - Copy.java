public class logicaloperators {
    public static void main(String[] args) {

        // && logical and
        System.out.println((3>2) && (5>0)); //tt T
        System.out.println((3>5) && (2>1)); //ft F
        System.out.println((1>2) && (1>3)); //ff F
        System.out.println((2>1) && (1>2)); //tf F

        // || logical or
        System.out.println((6>5) || (5>6)); //tf T
        System.out.println((9>10) ||(8>9)); //ff F
        System.out.println((6>1) || (4>2)); //tt T
        System.out.println((1>6) || (6>1)); //ft T

        // ! NOT operator
        System.out.println(!(3>2)); //t ka f
        System.out.println(!(0>1));



    }
    
}
