public class Main {

    public static void main(String[] args) {
        int n = 6;
    
        for (int i = 1; i <= n; i++) {
            // print space
            for(int j=1; j<=n-i; j++) {
                System.out.print("-");
            }
            //print star
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
