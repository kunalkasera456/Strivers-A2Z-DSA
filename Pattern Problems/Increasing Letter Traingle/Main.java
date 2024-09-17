/*
 * 1         
 * 1 2   
 * 1 2 3 
 */


public class Main {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) { 
                System.out.print(ch++ +" ");
            
            }
            System.out.println();
        }
    }
}
