/*
        ********
        *      *
        *      *
        *      *
        *      *
        *      *
        *      *
        ********
*/
public class NATSP1 {

    public static void main(String[] args) {
        int n = 6;
        
        for(int i=1; i <= n; i++) {
            if(i==1 || i==n)
            for(int j=1; j <= n; j++) {
                System.out.print("* ");
            }
            else {
                for (int j = 1; j <= n; j++) {
                    if(j==1 || j==n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
           
            System.out.println();
       }
    }
}
