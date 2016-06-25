/*Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].*/

public class Solution {
    
    private int getIndex(int[] a, int target, boolean isStart){
        
        int start = 0, end = a.length-1;
        int mid, index = -1;
        
        while (start <= end){
            mid = (start + end)/2;
            
            if (a[mid]<target)
                start = mid + 1;
            else if (a[mid]>target)
                end = mid - 1;
            else{
                index = mid;
                if(isStart)
                    end = mid - 1;
                else
                    start = mid + 1;
            }   
            
        }
        
        return index;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int start =  getIndex(nums, target, true);   
        int end =  getIndex(nums, target, false);
        
        int[] output = {start,end};
        return output;
    }
}