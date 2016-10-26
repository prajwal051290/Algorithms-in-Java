// Logic:
/*
 * This is dynamic programming problem.
 * Formula: 
 * 
 * if(wt[i-1] > j) {
 * 	dp[i][j] = dp[i-1][j];
	}
	else {
		dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
	}
 * 
 */

class Knapsack
{
 
          
	static int knapSack(int W, int[] wt, int[] val, int n) {
		int[][] dp = new int[n+1][W+1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= W; j++) {
				if(wt[i-1] > j) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}
			}
		}
		return dp[n][W];
    }
 
   
    // Driver program to test above function
    public static void main(String args[]) {
	    int val[] = new int[]{60, 100, 120};
	    int wt[] = new int[]{10, 20, 30};
	    int  W = 50;
	    int n = val.length;
	    System.out.println(knapSack(W, wt, val, n));
    }
}
