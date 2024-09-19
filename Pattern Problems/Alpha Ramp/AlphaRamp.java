public class AlphaRamp {
    public static void main(String[] args) {
        int n = 6;
        char ch = 'A';
        for(int i=0; i<n; i++) {
          
           for(int j=0; j<i+1; j++) {
               System.out.print(ch + " ");
           }
           ch++;
           System.out.println();
       }
    }
}
