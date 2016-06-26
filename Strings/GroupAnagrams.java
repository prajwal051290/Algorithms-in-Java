/*Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:
	
	[
	  ["ate", "eat","tea"],
	  ["nat","tan"],
	  ["bat"]
	]*/

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map<Integer,Integer> anagramMap = new HashMap<Integer,Integer>();
        List<List<String>> result = new ArrayList<List<String>>();
        
        for (String s : strs){
            int key = 1;
            for (char c : s.toCharArray()){
                key *= prime[c - 'a'];
            }
            List<String> anagrams;
            if (anagramMap.containsKey(key)){
                anagrams = result.get(anagramMap.get(key));
            }
            else{
                anagrams = new ArrayList<String>();
                result.add(anagrams);
                anagramMap.put(key,result.size()-1);
            }
            anagrams.add(s);
        }
        return result;
    }
}