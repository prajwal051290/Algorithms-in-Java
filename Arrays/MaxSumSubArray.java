/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.*/

public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    
	    if (a == null || a.size() == 0) {
	        return 0;
	    } 
	   
	    int maxSum = Integer.MIN_VALUE;
	    int currSum = 0;
	    
	    for (int i = 0; i < a.size(); i++) {
	        
	        if ((currSum + a.get(i)) < a.get(i)) {
	            currSum = a.get(i);     
	        } else {
	            currSum += a.get(i);
	        }
	        
	        if (currSum > maxSum) {
	            maxSum = currSum;
	        }
	    }
	    
	    return maxSum;
	}
}
