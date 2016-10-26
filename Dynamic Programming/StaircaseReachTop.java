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