/*Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.*/

public class Solution {
    public boolean isPowerOfFour(int num) {
        
        int power = 4;
        
        if(num==1)
            return true;
        
        while(power<num){
            if(power > Integer.MAX_VALUE/4)
                return false;
            power = power * 4;
        }
        if(power==num)
            return true;
        else
            return false;
    }
}