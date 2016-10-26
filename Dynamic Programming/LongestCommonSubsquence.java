// Logic:
/*
 * 1. This problem is solved with dynamic programming.
 * 2. Main formula:
 * 
 * if(A.charAt(i-1) == B.charAt(j-1))
   	dp[i][j] = dp[i-1][j-1] + 1;
   else
   	dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
 * 
 */

public class Solution {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        int[][] dp = new int[A.length()+1][B.length()+1];
        int max = 0;
        
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[i].length; j++) {
                if(A.charAt(i-1) == B.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    
                if(dp[i][j] > max)
                    max = dp[i][j];
            }
        }
        return max;
    }
}
