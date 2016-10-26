/*
 * Problem Description:
 * You can climb 1 step or 2 steps of a staircase. Find the total no of ways in which you can reach the to the top.
 * 
 * Logic:
 * This is exactly fibonnacci series.
 * Formula: f(n) = f(n-1) + f(n-2).
 * 
 * Modification: if we you can climp 1, 2 or 3 step then formula becomes
 * Formula: f(n) = f(n-1) + f(n-2) + f(n-3) and so on...
 *  
 */

class stairs
{
	static int countWays(int n) {
		int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 2;
		
		if(n == 1)
			return dp[0];
		if(n == 2)
			return dp[1];
		
		for(int i = 2; i < n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n-1];
	}
	
    public static void main (String args[]){
          int s = 4;
          System.out.println("Number of ways = "+ countWays(s));
    }
}