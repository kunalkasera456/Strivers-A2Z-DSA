import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        if(n == 0) {
            System.out.println("Please give the value Greater then 0"); 
            return;
        }
        

        // First row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < n; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            ArrayList<Integer> previousRow = triangle.get(i-1);

            // First element of every row is always 1
            currentRow.add(1);

            // Each element is the sum of the two elements above it
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j-1) + previousRow.get(j));
            }

            // Last element of every row is always 1
            currentRow.add(1);

            triangle.add(currentRow);
        }

        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j));
            }
            System.out.println();
        }


    }
}
