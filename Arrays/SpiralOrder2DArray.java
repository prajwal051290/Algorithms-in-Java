//Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

/*
 * Logic:
 * 1. Track toprow, rightmost col, bottomrow and leftmost column. Also track direction (right,down,left,up).
 * 2. Imp while condition: 
 * 
 *	while(topRow <= bottomRow && leftCol <= rightCol)
 *
 */

public class Solution {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 if(a == null)
		    return result;
		    
		 int topRow = 0, rightCol = a.get(0).size()-1, bottomRow = a.size()-1, leftCol = 0;
		 int dir = 0;
		 
		 while(topRow <= bottomRow && leftCol <= rightCol) {
		    if(dir == 0) {
		        ArrayList<Integer> temp = a.get(topRow);
		        for(int i = leftCol; i <= rightCol; i++) {
		            result.add(temp.get(i));
		        }
		        topRow++;
		    }
		    else if(dir == 1) {
		        for(int i = topRow; i <= bottomRow; i++) {
		            result.add(a.get(i).get(rightCol));
		        }
		        rightCol--;  
		    }
		    else if(dir == 2) {
		        ArrayList<Integer> temp = a.get(bottomRow);
		        for(int i = rightCol; i >= leftCol; i--) {
		            result.add(temp.get(i));
		        }
		        bottomRow--;
		    }
		    else if(dir == 3) {
		        for(int i = bottomRow; i >= topRow; i--) {
		            result.add(a.get(i).get(leftCol));
		        }
		        leftCol++;
		    }
		    
		    dir = (dir + 1) % 4;
		 }
		 
		 return result;
	}
}
