/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.*/

/*
 * 
 * Logic: This is a DP problem. You have to derive current state from previous robbery
 * Base Condition: dp[0] & dp[1]
 * 
 */

public class Solution {
    public int rob(int[] nums) { 
        int[] temp = new int[nums.length];
        if(nums.length==0)
            return 0;
        temp[0] = nums[0];
        if(nums.length>=2)
            temp[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length; i++){
            temp[i] = Math.max((nums[i]+temp[i-2]),temp[i-1]);
        }
        return temp[temp.length-1];
    }
}