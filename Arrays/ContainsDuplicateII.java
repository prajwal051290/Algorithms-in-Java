/*Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the 
array such that nums[i] = nums[j] and the difference between i and j is at most k.*/

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> arrayMap = new HashMap<Integer,Integer>();
        
        for (int i=0; i<nums.length; i++){
            if (!arrayMap.containsKey(nums[i]))
                arrayMap.put(nums[i],i);
            else
                if (i-arrayMap.get(nums[i])<=k)
                    return true;
                else
                    arrayMap.put(nums[i],i);
        }
        
        return false;
    }
}