/*
 *  C
    C B 
    C B A
 */

public class AlphaTraingle {
    public static void main(String[] args) {
        int n = 26;
        for (int i = 1; i <= n; i++) {
            char c = (char) (64+n);
            for (int j = 1; j <= i; j++) {
                System.out.print(c-- + " ");
            }
            System.out.println();
        }

    }
}
