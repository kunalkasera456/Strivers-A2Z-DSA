/*
 * Input: matrix =  [1,2,3]
 *                  [4,5,6]
 *                  [7,8,9] 
 *   Output: [1,2,3,6,9,8,7,4,5]
 */

import java.util.ArrayList;

public class spiralMatrix {

    public static void main(String[] args) {
        int matrix[][] =  { { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };
        int n = matrix.length;
        int m = matrix[0].length;
        
        int left = 0;
        int top = 0;
        int bottom = n-1;
        int right = m-1;
        ArrayList<Integer> list = new ArrayList<>();
        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {                       // let for one sigle row = 1,2,3,4,5
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }  
            }
            bottom--;
            if(left <= right) {

                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
            
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }

    }
}
