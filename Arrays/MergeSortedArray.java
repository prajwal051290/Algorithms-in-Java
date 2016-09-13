/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.*/


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        for(int i=0; i<m; i++){
            if(nums1[i]>nums2[0]){
                int temp = nums2[0];
                nums2[0] = nums1[i];
                nums1[i] = temp;
                for(int j=0; j<n-1; j++){
                    if(nums2[j]>nums2[j+1]){
                        int temp1 = nums2[j];
                        nums2[j] = nums2[j+1];
                        nums2[j+1] = temp1;
                    }
                    else
                        break;
                }
            }
        }
        for(int i=0; i<n; i++){
            nums1[m] = nums2[i];
            m++;
        }
    }
}