/*Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.*/

/*
 * Logic: Simple hashmap of character to string will solve this problem.
 * Imp condition to check below is - 
 * 
 * if(patternMap.containsValue(arr[i])){
                    return false;
                }
 * 
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        int patternLenth = pattern.length();
        String[] arr = str.split(" ");
        int arrLength = arr.length;
        if(patternLenth!=arrLength)
          return false;
        Map<Character,String> patternMap = new HashMap<Character,String>();
        for(int i=0; i<patternLenth; i++){
            if(patternMap.containsKey(pattern.charAt(i))){
                if(arr[i].equals(patternMap.get(pattern.charAt(i)))==false){
                    return false;
                }
            }else{
                if(patternMap.containsValue(arr[i])){
                    return false;
                }
                else
                    patternMap.put(pattern.charAt(i),arr[i]);
            }
        }
        return true;
    }
}