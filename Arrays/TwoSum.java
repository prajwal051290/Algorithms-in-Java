/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> indices = new HashMap<Integer,Integer>();
        int[] result = {-1,-1};
        
        for(int i=0; i<nums.length; i++)
            indices.put(nums[i],i);
        
        for (int i=0; i<nums.length; i++){
            if(indices.containsKey(target-nums[i]) && indices.get(target-nums[i])!=i){
                result[0] = i;
                result[1] = indices.get(target-nums[i]);
                break;
            }
        }
        return result;
    }
}