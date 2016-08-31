/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1*/

//Logic: Floyd's cycle detection algorithm

public class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do{
            slow = squaredSum(slow);
            fast = squaredSum(fast);
            fast = squaredSum(fast);
        }while(slow!=fast);
        
        if(slow==1)
            return true;
        else
            return false;
    }
    
    private int squaredSum(int n){
        int sum = 0;
        while(n!=0){
            int mod = n%10;
            n = n/10;
            sum = sum + (mod*mod);
        }
        return sum;
    }
}