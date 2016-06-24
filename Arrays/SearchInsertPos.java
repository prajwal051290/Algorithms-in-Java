/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0, end = nums.length-1;
        int mid = 0;
        
        while (start<=end){
            mid = (start + end)/2;
            
            if (nums[mid] > target)
                end--;
            else if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] == target)
                return mid;
            
        }
        
        if (start > end)
            return start;
        else
            return end;
    }   
}