/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.*/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> integerCount = new HashMap<Integer,Integer>();
        
        for (int i=0; i<nums1.length; i++){
            if(integerCount.containsKey(nums1[i]))
                integerCount.put(nums1[i],integerCount.get(nums1[i])+1);
            else
                integerCount.put(nums1[i],1);
        }
        
        List<Integer> resultList = new ArrayList<Integer>();
        
        for(int i=0; i<nums2.length; i++){
            if(integerCount.containsKey(nums2[i]) && integerCount.get(nums2[i])>0){
                resultList.add(nums2[i]);
                integerCount.put(nums2[i],integerCount.get(nums2[i])-1);
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i=0; i < result.length; i++)
        {
            result[i] = resultList.get(i);
        }
        return result;
        
    }
}