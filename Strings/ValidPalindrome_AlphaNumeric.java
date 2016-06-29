/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.*/

public class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0, j=s.length()-1;
        
        while(i<=j){
            
            if (!((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || isDigit(s.charAt(i)))){
                i++;
                continue;
            }
            else if(!((s.charAt(j)>=65 && s.charAt(j)<=90) || (s.charAt(j)>=97 && s.charAt(j)<=122) || isDigit(s.charAt(j))))
            {
                j--;
                continue;
            }    
            
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
            else{
                i++;
                j--;
            }
            
        }
        
        return true;
        
    }
    
    private boolean isDigit(char temp){
        
        if (temp >= 48 && temp <= 57)
            return true;
        else
            return false;
    }
}