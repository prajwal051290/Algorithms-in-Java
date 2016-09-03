/*Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.*/

// Logic: all the numbers like 5, 10, 20, 30, 45 etc. which can contribute to trailing zeros in a factorial
// can be futher broken down into 5s. So we have to count the no of '5' factors in a give number.

public class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        while(n>=5){
            n=n/5;
            result = result + n;
        }
        return result;
    }
}