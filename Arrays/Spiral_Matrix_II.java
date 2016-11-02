/*Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
	
	[
	 [ 1, 2, 3 ],
	 [ 8, 9, 4 ],
	 [ 7, 6, 5 ]
	]
*/

/*
 * Logic: Same as Spiral order printing of matrix
 */

public class Solution {
    public int[][] generateMatrix(int n) {
        
        int topRow = 0, rightCol = n-1, bottomRow = n-1, leftCol = 0;
        int dir = 0;
        int val = 1;
        int[][] result = new int[n][n];
        
        while (topRow <= bottomRow && leftCol <= rightCol) {
            
            if (dir == 0) {
                for (int i = leftCol; i <= rightCol; i++) {
                    result[topRow][i] = val;
                    val++;
                }
                topRow++;
            } else if (dir == 1) {
                for (int i = topRow; i <= bottomRow; i++) {
                    result[i][rightCol] = val;
                    val++;
                }
                rightCol--;
            } else if (dir == 2) {
                for (int i = rightCol; i >= leftCol; i--) {
                    result[bottomRow][i] = val;
                    val++;
                }
                bottomRow--;
            } else if (dir == 3) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[i][leftCol] = val;
                    val++;
                }
                leftCol++;
            }
            
            dir = (dir + 1) % 4;
        }
        
        return result;
    }
}