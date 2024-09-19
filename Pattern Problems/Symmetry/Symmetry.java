
/*  *         *
    * *     * *
    * * * * * *
    * *     * *
    *         * 
*/

public class Symmetry {
    public static void main(String[] args) {
        int n = 3;
        
        for(int i=1; i <= 2*n-1; i++) {
            //star
            int star = i;
            if(i>n) {
                star = 2*n-i;
            }
            for(int j=1; j <= star; j++) {
                System.out.print("* ");
            }
            //spaces
            int spaces;
            if(i<=n) {
                 spaces = 2*n - 2*i;
            } else {
                 spaces = 2*i - 2*n;
            }
            for (int j = 1; j <= spaces; j++) {
               System.out.print("- ");
            }
            //star 
            // int star2 = i;
            for (int j = 0; j <= star-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
       }
    }

}
