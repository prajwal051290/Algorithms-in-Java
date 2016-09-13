/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/

/*
 * Logic: This is like DP. Your no of ways to reach current step will be determined by no of ways you reached previous
 * 2 steps.
 * Always handle base conditions first. Like 1 step and 2 steps. Then keep deriving further.
 * This derivation translates into a for loop
 * 
 */

public class Solution {
    public int climbStairs(int n) {
        int prevStep = 0, currStep = 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        prevStep = 1;
        currStep = 2;
        for(int i=2; i<n; i++){
            int temp = currStep;
            currStep = currStep + prevStep;
            prevStep = temp;
        }
        return currStep;
    }
}