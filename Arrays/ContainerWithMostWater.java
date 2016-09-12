/*Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.*/

/*
 * O(n) solution
 * 
 * Start calculating area from two extreme indices of an array.
 * Container's height will be determined by smaller height.
 * Move the index of smaller height. Keep doing this till both the pointers meet
 * 
 */

public class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1;
        int area = 0;
        while(low<high){
            area = Math.max(area, ((high-low)*Math.min(height[low],height[high])));
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return area;
    }
}