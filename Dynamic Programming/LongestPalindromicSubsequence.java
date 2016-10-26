/*
 * find longest palindromic subsequence in a given string.
 * Eg: Input: "agbdba" -> Output: "abdba" Length = 5
 * 
 * Logic:
 * 
 * This is solved using dynamic programming.
 * Solve the problem for string of length 1, 2, 3, ... till input string's length.
 * 
 * Formula:
 * 
 * if((len == 2) && (input.charAt(i) == input.charAt(j)))
	dp[i][j] = 2;
   else if(input.charAt(i) == input.charAt(j))
	dp[i][j] = dp[i+1][j-1] + 2;
   else
   	dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
 * 
 */


public class Solution {

	
	public int LongestPalindromicSubsequence(String input) {
		int[][] dp = new int[input.length()][input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			dp[i][i] = 1;
		}
		
		for(int len = 2; len <= input.length(); len++) {
			for(int i = 0; i < input.length() - len + 1; i++) {
				int j = i + len -1;
				
				if((len == 2) && (input.charAt(i) == input.charAt(j)))
					dp[i][j] = 2;
				else if(input.charAt(i) == input.charAt(j))
					dp[i][j] = dp[i+1][j-1] + 2;
				else
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
			}
		}
		
		return dp[0][input.length()-1];
	}
	
}
