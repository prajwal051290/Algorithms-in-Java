import java.util.*;

public class Solution {
    
    private List<Integer> getIntersection(int[] arr1, int[] arr2){
        
        List<Integer> output = new ArrayList<Integer>();
        Hashtable temp = new Hashtable();
        
        int i = 0;
        
        for (i=0; i<arr1.length; i++)
            temp.put(arr1[i],i);
            
        for (i=0; i<arr2.length; i++){
            if (temp.contains(arr2[i]) && !output.contains(arr2[i]))
                output.add(arr2[i]);
        }
        
        return output;
    }
    
    public List<Integer> intersection(int[] nums1, int[] nums2) {
        
        int length1 = nums1.length;
        int length2 = nums2.length;
        List<Integer> output = new ArrayList<Integer>();
        
        // create Hashtable of smaller array
        if (length1 <= length2)
            output = getIntersection(nums1,nums2); 
        else
            output = getIntersection(nums2,nums1);
            
        return output;
    }
}