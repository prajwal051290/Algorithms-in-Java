/*Determine whether an integer is a palindrome. Do this without extra space.*/

public class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0)
            return false;
        else{
            if(reverseNumber(x)==x)
                return true;
            else
                return false;
        }
    }
    
    private long reverseNumber(int num){
        
        long revNum = 0;
        
        while(num!=0){
            
            revNum = (revNum*10) + num%10;
            num = num/10;
            
        }
        return revNum;
    }
}