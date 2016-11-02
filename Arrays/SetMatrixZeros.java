/*Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.*/

/*
 * Logic:
 * 1. start from second row.
 * 2. Handle first row separately.
 * 3. In the first phase, use matrix elements to set states in a top-down way. 
 * 4. In the second phase, use states to set matrix elements in a bottom-up way.
 * Note: state of a current row is stored in matrix[row][0] & state of a current column is stored in matrix[0][column]
 */

public class Solution {
    public void setZeroes(int[][] matrix) {
        
        if (matrix == null) {
            return;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int k = 0;
        
        for (k = 0; k < cols && matrix[0][k] != 0; k++);
        
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < rows; i++) {
            for (int j = cols-1; j >= 0; j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (k < cols) {
            Arrays.fill(matrix[0], 0);
        }
    }
}