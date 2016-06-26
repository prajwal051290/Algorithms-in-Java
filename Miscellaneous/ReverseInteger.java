/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321*/

import java.lang.Exception.*;

public class Solution {
    public int reverse(int x){
    
        int reverseNumber = 0;
        
        while(x!=0){
            
            if (reverseNumber > (Integer.MAX_VALUE)/10 || reverseNumber < (Integer.MIN_VALUE)/10)
                return 0;
            reverseNumber = (reverseNumber*10) + x%10;
            x=x/10;
        }
        return reverseNumber;
    }
}