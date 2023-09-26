public class abcdlinepattern {
    public static void main(String[] args) {
        //int n = 4;
        char ch = 'A';
        //for outer loop
        for(int line = 1; line<=4; line++){
            //for inner loop
            for(int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
