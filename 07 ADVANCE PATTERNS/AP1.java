public class AP1 {
    public static void hollow_rectangle(int rows , int coloum) {
        //outer loop
        for(int i =1 ; i<=rows ; i++){
            //innerloop
            for(int j = 1 ; j<=coloum ; j++){
                //cell(i,j)
                if(i==1 || i== rows || j == 1 || j == coloum){
                    //boundaryconditions
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
         hollow_rectangle(4,5);
    }
}
