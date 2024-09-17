/*
 *      A
      A B A
    A B C B A
 */


public class Solution {

    
   public static void main(String[] args) {
    int n = 6;
    
    for(int i=1; i <= n; i++) {
        //space
        for(int j=1; j <= n-i; j++) {
            System.out.print("- ");
        }
        //character
        char ch1 = 'A';
        
        char ch2 = (char) (63+i);
        for (int j = 1; j <= 2*i-1; j++) {
            if(j>i) {
                System.out.print(ch2-- +" ");
            } else {
                System.out.print(ch1++ +" ");
            }
        }
        System.out.println();
   }
}
}
