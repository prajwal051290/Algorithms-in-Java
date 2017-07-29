Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]


public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return null;
        }
        
        List<List<Integer>> resultTriplet = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-1; i++) {
            
            int Sum2 = nums[i] + nums[i+1];
            
            for (int j = i+2; j < nums.length; j++) {
                
                if ((Sum2 + nums[j]) == 0) {
                    
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[i+1]);
                    temp.add(nums[j]);
                    resultTriplet.add(temp);
                        
                }
                
            }
            
        }
        
        return resultTriplet;
    }
}