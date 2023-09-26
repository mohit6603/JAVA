public class basicpatterns {

    public static void main(String[] args) {
      //nested loops = loops ke andar loops 
      for(int line = 1; line<=4; line++){
        for(int star = 1; star<=line ;star++){
            System.out.print("*");
        }
        System.out.println();
      } 
      
      
    //inverted of above pattern
    for(int line = 1; line<=4; line++){
      for (int star = 4; star>=line; star--) {
        System.out.print("*");
      }
      System.out.println();
    }  



    //print half pyramid patter
    for (int line = 1; line <= 4; line++) {
      for (int num = 1; num <= line; num++) {
        System.out.print(num);
      }
      System.out.println();
    }
    }
    
}
