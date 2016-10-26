// Logic:
/*
 * This problem is solved using dynamic programming approach.
 * Create a dp[] array of length = given array's length.
 * Initialize all elements to 1. Because, every element of input array is an increasing subsequence in itself.
 * now use 2 pointers j & i. keep comparing elements at index j & i and update dp[] array for increasing
 * subsequence length at i index. The maximum value in dp[] array is the answer.
 * 
 *  formula:
 *  
 *  if(j < i) {
    	if((nums[j] < nums[i]) && (dp[j] + 1 > dp[i]))
			dp[i] = dp[j] + 1;
            j++;
        }
        else {
        	j = 0;
            i++;
        }
  	}
 *  
 *  
 */

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int i = 1, j = 0, maxLength = 0;
        
        while(j < dp.length) {
            dp[j] = 1;
            j++;
        }
        
        j = 0;
        
        while(i < nums.length) {
            if(j < i) {
                if((nums[j] < nums[i]) && (dp[j] + 1 > dp[i]))
                    dp[i] = dp[j] + 1;
                j++;
            }
            else {
                j = 0;
                i++;
            }
        }
        
        for(i = 0; i < dp.length; i++) {
            if(dp[i] > maxLength)
                maxLength = dp[i];
        }
        
        return maxLength;
    }
}