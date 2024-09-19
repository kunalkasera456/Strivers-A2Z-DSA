/*
        * * * * * * 
        * *     * * 
        *         * 
        *         * 
        * *     * * 
        * * * * * * 
 */

public class SymmetryVoid {
    public static void main(String[] args) {
        int n = 3;

        int space = 0;
        for(int i=1; i <= n; i++) {
            //start
            for(int j=1; j <= n-i+1; j++) {
            System.out.print("* ");
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("- ");
            }
            //star
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            space = space+2;
            System.out.println();
        }
        // int space2 =0;
        space = space -2;
        for(int i=1; i <= n; i++) {
            //start
            for(int j=1; j <= i; j++) {
            System.out.print("* ");
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("- ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            space = space-2;
            System.out.println();
        }
   }
}
