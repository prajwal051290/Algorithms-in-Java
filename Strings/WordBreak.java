/*Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".*/

/*
 * Logic:
 * 
 * Create boolean array of s.length()+1. Mark zero index as true
 * check every word of dictionary against source string and if found mark end position as true.
 * wordFound[end] = true marks true at the very next character after the recently found word.
 * This is because we have boolean array of bigger size than source string
 * 
 * Imp handling: if end>length then continue;
 * Skip over all the false indexes in boolean array
 * 
 */

public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int length = s.length();
        boolean[] wordFound = new boolean[length+1];
        wordFound[0] = true;
        
        for(int i=0; i<length; i++){
            if(!wordFound[i])
                continue;
            for(String word : wordDict){
                int end = i + word.length();
                if(end>length)
                    continue;
                if(s.substring(i,end).equals(word))
                    wordFound[end] = true;
            }
        }
        return wordFound[length];
    }
}