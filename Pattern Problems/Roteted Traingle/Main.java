/*
 * Input: ‘N’ = 3

Output: 
                *
                **
                ***
                **
                *
 */


public class Main {
    public static void main(String[] args) {
        int n = 6;
    
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i > n) {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
