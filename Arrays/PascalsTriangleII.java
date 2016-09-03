/*Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?*/

// Logic: Same as pascal triangle. Just no need of List<List<Integer>>

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        for(int i=1; i<=rowIndex; i++){
            List<Integer> result = new ArrayList<Integer>();
            result.add(1);
            for(int j=0; j<prev.size()-1; j++){
                result.add(prev.get(j) + prev.get(j+1));
            }
            result.add(1);
            prev = result;
        }
        return prev;
    }
}