/*Write a function to find the longest common prefix string amongst an array of strings.*/

/*
 * Logic:
 * 1. Longest common prefix could be the shortest string in the given array.
 * 2. Hence, find shortest string first.
 * 3. start matching character by character with other strings
 *  
 * Complexity - O(n^2)
 * 
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0)
            return "";
            
        int minLength = strs[0].length();
        int index = 0;
        
        for(int i=0; i<strs.length; i++){
            if(strs[i].length() < minLength){
                index = i;
                minLength = strs[i].length();
            }
        }
        
        String minLengthStr = strs[index];
        boolean prefix = true;
        StringBuilder stb = new StringBuilder();
        for(int i=0; i<minLength; i++){
            char temp = minLengthStr.charAt(i);
            for(int j=0; j<strs.length; j++){
                if(temp != strs[j].charAt(i)){
                    prefix = false;
                    break;
                }
            }
            if(prefix)
                stb.append(temp);
            else
                break;
        }
        return stb.toString();
    }
}   