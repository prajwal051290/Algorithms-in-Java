/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at 
least twice in the array, and it should return false if every element is distinct.*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> arrayMap = new HashMap<Integer,Integer>();
        int i = 0;
        
        for (i=0; i<nums.length; i++)
            if (!arrayMap.containsKey(nums[i]))
                arrayMap.put(nums[i],0);
            else
                return true;
                
        return false;
        
    }
}