/*You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?*/

/*
 * Logic:
 * Find pattern on notebook, you will know i&j for result matrix.
 * Time - o(n^2), space - O(n^2) 
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