import java.util.*;
public class Trappingrainwater {
    
    public static int trappedwater(int height[]) {
        int n = height.length;
        //s1 leftmax
        int leftmax[]= new int [n];
        leftmax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i]= Math.max(height[i], leftmax[i-1]);
        }
        //s2 rightmax
        int rightmax [] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i =n-2; i>=0 ; i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }
        //s3 trapped water
        int trappedrainwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedrainwater += (waterlevel-height[i])*1;          // { trappedrainwater  = trappedrainwater + (waterlevel-height[i])*1 }
        }
        return trappedrainwater;
    }

    public static void main(String[] args) {
       int height[]={4,2,0,6,3,2,5};
       System.out.println("trapped rain water is : " + trappedwater(height));
    }
}
