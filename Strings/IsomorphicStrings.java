/*Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.*/

//Logic:

/*
 * Only hashmap will solve this problem.
 * Map every character of S to t
 * special case: "ab" & "aa". Check else condition below 
 */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> charMap = new HashMap<Character,Character>();
        for(int i=0; i<s.length(); i++){
            if(charMap.containsKey(s.charAt(i))){
                if(t.charAt(i)!=charMap.get(s.charAt(i)))
                    return false;
            }
            else{
                if(charMap.containsValue(t.charAt(i)))
                    return false;
                charMap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}