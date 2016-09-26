/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?*/

/*
 * Logic:
 * 1. Place numbers at their index in the array.
 * 2. traverse array again to find missing number i.e. (arr[i]!=i)
 */

public class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==i || nums[i]==nums.length)
                continue;
            else{
                swap(nums,i,nums[i]);
                if(nums[i]!=i)
                    i--;
            }
        }
        int i=0;
        for(; i<nums.length; i++){
            if(nums[i]!=i)
                break;
        }
        return i;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}