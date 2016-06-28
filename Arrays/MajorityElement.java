/*Given an array of size n, find the majority element. The majority element is the element that appears more than [n/2] times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

public class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> arrayElements = new HashMap<Integer,Integer>();
        int i;
        
        for(i=0; i<nums.length; i++){
            if(arrayElements.containsKey(nums[i]))
                arrayElements.put(nums[i],arrayElements.get(nums[i])+1);
            else
                arrayElements.put(nums[i],1);
        }
        
        for(i=0; i<nums.length; i++){
            if(arrayElements.get(nums[i])>nums.length/2)
                break;
        }    
        return nums[i];
    }
}