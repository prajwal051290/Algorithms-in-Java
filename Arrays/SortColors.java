// Logic: Put all zeros to left and all 2's to right. 1's will automatically be in the middle.
// while and if conditions are imp below

/*Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.*/

public class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        
        while(i<=high){
            if (nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;
                i++;
                low++;
            }
            else if (nums[i]==2){
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
            }
            else
                i++;
        }
        
    }
}