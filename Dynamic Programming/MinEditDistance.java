/*Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

a) Insert a character
b) Delete a character
c) Replace a character*/

// Logic:
/*
 * This is solved using dynamic programming.
 * 
 * Formula:
 * 
 * if(word2.charAt(i-1) == word1.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int temp = getMin(dp[i][j-1], dp[i-1][j-1], dp[i-1][j]);
                    dp[i][j] = temp + 1;
                }
 */

public class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word2.length()+1][word1.length()+1];
        
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[i].length; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                    continue;
                }
                    
                if(j == 0) {
                    dp[i][j] = i;
                    continue;
                }
                
                if(word2.charAt(i-1) == word1.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int temp = getMin(dp[i][j-1], dp[i-1][j-1], dp[i-1][j]);
                    dp[i][j] = temp + 1;
                }
                
            }
        }
        
        return dp[word2.length()][word1.length()];
    }
    
    private int getMin(int val1, int val2, int val3) {
        if(val1 < val2) {
            if(val1 < val3) {
                return val1;
            }
            else {
                return val3;
            }
        }
        else {
            if(val2 < val3) {
                return val2;
            }
            else {
                return val3;
            }
        }
    }
}