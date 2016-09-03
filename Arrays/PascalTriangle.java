/*Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return*/

/*[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows>0){
            List<Integer> firstList = new ArrayList<Integer>();
            firstList.add(1);
            result.add(firstList);
        }    
        for(int i=1; i<numRows; i++){
            List<Integer> prev = result.get(result.size()-1);
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j=0; j<prev.size()-1; j++){
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}