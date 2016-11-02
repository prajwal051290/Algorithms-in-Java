/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:
	
	[
	  [1,   3,  5,  7],
	  [10, 11, 16, 20],
	  [23, 30, 34, 50]
	]
*/

/*
 * Logic: 
 * 
 * Use binary search for 2d matrix.
 * particular matrix cell is calculated as:
 * 
 * midR = mid / cols;
   midC = mid % cols;
   
   Time Complexity : O(log(m*n))
   Space Complexity : in place
 * 
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix == null) {
            return false;
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int start = 0, end = (rows * cols) - 1, mid = 0, midR = 0, midC = 0;
        
        while (start <= end) {
            mid = (start + end) / 2;
            midR = mid / cols;
            midC = mid % cols;
            
            if (matrix[midR][midC] < target) {
                start = mid + 1;
            } else if (matrix[midR][midC] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}