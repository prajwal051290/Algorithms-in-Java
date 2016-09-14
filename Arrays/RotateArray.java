/*Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

/*
 * Logic: Reverse the array 3 times as per below solution
 */

public class Solution {
    
    private void reverse(int[] nums, int low, int high){
        
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
        
    }
    
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        
        if(k==0) return;
        
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
}