/*Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.*/

/*
 * Logic:
 * Loop through and find min. Simple logic.
 * Time complexity - O(n), Space complexity - O(n)
 */

public class Solution {
    public int findMin(int[] nums) {
        int minElement = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<minElement){
                minElement = nums[i];
                break;
            }
        }
        return minElement;
    }
}