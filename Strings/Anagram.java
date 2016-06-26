/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.*/

public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() == t.length()){
            
            Map<Character,Integer> charMap = new HashMap<Character,Integer>();
            int count = 0; 
            
            for (int i = 0; i < s.length(); i++){
                if (charMap.containsKey(s.charAt(i)))
                    charMap.put(s.charAt(i),charMap.get(s.charAt(i))+1);
                else
                    charMap.put(s.charAt(i),1);    
            }
            
            for (int i=0; i < t.length(); i++){
                if (!charMap.containsKey(t.charAt(i)))
                    return false;
                else{
                    charMap.put(t.charAt(i),charMap.get(t.charAt(i))-1);
                    if (charMap.get(t.charAt(i))==0)
                        charMap.remove(t.charAt(i));
                }
            }
            
            return true;
            
        }
        else
            return false;
        
    }
}