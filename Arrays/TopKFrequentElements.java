/*Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size*/

/*
 * Logic:
 * 1. create Map to maintain elements' count
 * 2. build array of arrayList. In this array, maintain a list at an index = count from map - 1; 
 * 3. Build the result from the array from back-side
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> intMap = new HashMap<Integer,Integer>();
        List<Integer> result = new ArrayList<Integer>();
        //Building a map to maintain element's count
        for(int i=0; i<nums.length; i++){
            if(intMap.containsKey(nums[i])){
                intMap.put(nums[i],intMap.get(nums[i])+1);
            }
            else
                intMap.put(nums[i],1);
        }
        //Build array of arrayList
        List<Integer>[] arr = new ArrayList[nums.length];
        for(Map.Entry<Integer,Integer> entry : intMap.entrySet()){
            if(arr[entry.getValue()-1]==null){
                arr[entry.getValue()-1] = new ArrayList<Integer>();
            }
            arr[entry.getValue()-1].add(entry.getKey());
        }
        //Retrieve top K elements
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==null)
                continue;
            else{
                for(int j=0; j<arr[i].size(); j++){
                    if(k>0){
                        result.add(arr[i].get(j));
                        k--;
                    }
                    else
                        break;
                }
                if(k==0)
                    break;
            }
        }
        return result;
    }
}