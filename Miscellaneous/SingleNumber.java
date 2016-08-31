/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

// Logic: XOR every number with each other. The number which is single will remain in the result.
// XOR Property: (A^B)^A = (A^A)^B. Here the result will be 'B'

public class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i=0; i<nums.length; i++){
            single = single ^ nums[i];
        }
        return single;
    }
}