/*
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
*  Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

public class setMatrix {

    public static void main(String[] args) {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int n = matrix.length;
        int m = matrix[0].length;
        int [] col = new int[n];
        int [] row = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    col[i] = 1;
                    row[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[j] == 1 || col[i] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
