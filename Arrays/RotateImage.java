/*You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?*/

/*
 * Logic:
 * 1. Find pattern on notebook, you will know i&j for result matrix.
 * Time - o(n^2), space - O(n^2)
 * 
 * 2. Transpose + reverse row by row
 * Time - O(n^2), Space - O(1)
 *  
 */

public class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] temp = new int[row][col];
        int dummyCol = col-1;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                temp[j][dummyCol] = matrix[i][j];
            }
            dummyCol--;
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}

----------------------------------------------------------------

public class Solution {
    public void rotate(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i=0; i<rows; i++){
            for(int j=i+1; j<cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0; i<rows; i++){
            int dummyCol = cols-1;
            for(int j=0; j<cols/2; j++){
                int temp = matrix[i][dummyCol];
                matrix[i][dummyCol] = matrix[i][j];
                matrix[i][j] = temp;
                dummyCol--;
            }
        }
    }
}