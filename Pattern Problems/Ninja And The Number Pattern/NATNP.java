
/*
 *      4444444
        4333334
        4322234
        4321234
        4322234
        4333334
        4444444
 */

public class NATNP {

    public static void main(String[] args) {
        int n = 4;
        
        for(int i=0; i < 2*n-1; i++) {
            for(int j=0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int bottom = 2*n-i-2;
                int right = 2*n-j-2;
                int min = Math.min(Math.min(right, bottom), Math.min(left, top));
                System.out.print(n- min+" ");
            }
            
           
            System.out.println();
       }
    }
}
