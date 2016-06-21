/*Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".*/

public class Solution {
    public String reverseVowels(String s) {
        
        int start = 0;
        int end = s.length()-1;
        char temp;
        char[] arr = s.toCharArray();
        
        while (start < end){
            
            if (isVowel(arr[start]) && isVowel(arr[end])){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if (isVowel(arr[start]) && !isVowel(arr[end]))
                end--;
            else if (!isVowel(arr[start]) && isVowel(arr[end]))
                start++;
            else{
                start++;
                end--;
            }
        }
        
        return new String(arr);
    }
    
    Boolean isVowel(char temp){
        
        if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U')
            
            return true;
            
        else
            return false;
    }
}
